-- sys 유저 상태에서 데이터베이스 생성 및 권한 부여
--alter session set "_oracle_script"=true; 
--create user category identified by 1234;
--grant all privileges to category;

-- 생성한 사용자 계정으로 접속
--sql> conn category/1234
--연결되었습니다.
--sql>
commit;

-- 카테고리 테이블 생성
-- drop table category cascade constraint
create table category(
category_id  number(5)   primary key,
category_name varchar2(100) not null ,
description            varchar2(200));
desc category

-- drop table product
create table product(
product_id   number(5)     primary key,
product_name varchar2(100) not null,
price number(10)  default 0,  
category_id number(5) references category(category_id) on delete cascade,
/* category_id number(5) references category(category_id), */
receipt_date date
/* constraint fk_category_id references category(category_id) on delete cascade */
);
/* alter table product add constraint fk_category_id foreign key(category_id) references category(category_id) on delete cascade; */
desc product;

select * from user_tables




commit;

--데이터 입력
insert into category values(1,	'전자제품',	'tv, 세탁기, 냉장고등');
insert into category values(2,	'가정용품',	'가정에서 사용하는 일반용품');
insert into category values(3,	'자동차',		'승용차, 화물차, 버스등');
insert into category values(4,	'컴퓨터',		'노트북, 데스크탑, 랩탑');
insert into category values(5,	'식료품',		'쌀, 야채, 채소 등');
select * from category
delete from category where category_id = 1


insert into product values(1,	'냉장고',			37000,	1,  	to_date('2021/01/20','yyyy-mm-dd'));
insert into product values(2,	'에어컨',			4000,	1,  	to_date('2018/02/21','yyyy-mm-dd'));
insert into product values(3,	'선풍기',			5000,	1,  	to_date('2015/03/07','yyyy-mm-dd'));
insert into product values(4,	'led tv',		2000,	1,  	to_date('2013/05/14','yyyy-mm-dd'));
insert into product values(5,	'lcd tv',		1000,	1,  	to_date('2021/02/05','yyyy-mm-dd'));
insert into product values(6,	'oled tv',		3000,	1,  	to_date('2019/10/03','yyyy-mm-dd'));
insert into product values(7,	'자전거',			1000,	2,  	to_date('2018/03/12','yyyy-mm-dd'));
insert into product values(8,	'데스크탑 컴퓨터',	3000,	4,  	to_date('2015/05/17','yyyy-mm-dd'));
insert into product values(9,	'의자',			2000,	2,  	to_date('2017/12/22','yyyy-mm-dd'));
insert into product values(10,	'신발',			1000,	2,  	to_date('2020/04/26','yyyy-mm-dd'));
insert into product values(11,	'승용자',			300000,	3,  	to_date('2017/10/07','yyyy-mm-dd'));
insert into product values(12,	'탱크로리',		500000,	3,  	to_date('2016/07/08','yyyy-mm-dd'));
insert into product values(13,	'오토바이',		50000,	3,  	to_date('2018/06/06','yyyy-mm-dd'));
insert into product values(14,	'태블릿컴퓨터',		23000,	4,  	to_date('2019/05/22','yyyy-mm-dd'));
insert into product values(15,	'노트북 컴퓨터',	25000,	4,  	to_date('2020/02/20','yyyy-mm-dd'));
insert into product values(16,	'안마의자',		20000,	2,  	to_date('2018/04/27','yyyy-mm-dd'));
insert into product values(17,	'감자',			2500,	5,  	to_date('2019/06/12','yyyy-mm-dd'));
insert into product values(18,	'쌀',			3000,	5,  	to_date('2020/01/11','yyyy-mm-dd'));
insert into product values(19,	'채소',			1000,	5,  	to_date('2022/01/10','yyyy-mm-dd'));
insert into product values(20,	'꽃',			2000,	5,  	to_date('2021/08/09','yyyy-mm-dd'));
commit;

insert into product values(21,	'양배추',			2000,	5,  	to_date('2022/07/10','yyyy-mm-dd'));
select * from product
desc product

-- 두 테이블 조인(join)
select c.category_id, c.category_name, p.product_id, p.product_name
from product p inner join category c on c.category_id = p.category_id
order by c.category_id;



-- 1.(표준 쿼리) 전 상품의 카테고리명과 상품명, 가격, 입고일자를 출력하되 카테고리로 오름차순 정렬하시오.
select c.category_id, c.category_name, p.product_id, p.product_name, p.price, to_char(receipt_date, 'yyyy-mm-dd') as receipt_date
from category c left outer join product p on c.category_id = p.category_id
order by c.category_id;

-- 1. 전 상품의 카테고리명과 상품명, 가격, 입고일자를 출력하되 카테고리로 오름차순 정렬하시오.
select c.category_id, c.category_name, p.product_id, p.product_name, p.price, to_char(receipt_date, 'yyyy-mm-dd') as receipt_date
from product p, category c 
where p.category_id = c.category_id
order by c.category_id;


-- 2. 카테고리가 전자제품인 상품들의 카테고리명, 상품명 가격을 조회하시오.
select c.category_name, p.product_name, p.price
from category c inner join product p on c.category_id = p.category_id
where c.category_name = '전자제품'

--3. 가격이 25,000원 이상인 상품들의 이름과 가격을 조회하시오.
select p.product_name, p.price
from product p
where p.price >= 25000
order by p.price desc


-- 4. 카테고리별로 카테고리명과 합계금액을 조회하되 금액이 큰 순서로 정렬하시오.
select c.category_name, sum(p.price) as price
from category c inner join product p on c.category_id = p.category_id
group by c.category_name
order by sum(p.price) desc

-- 4.2
select c.category_name, sum(p.price) as price
from category c, product p
where c.category_id = p.category_id
group by c.category_name
order by sum(p.price) desc

-- 5. 양배추 추가(삽입)
insert into product values(21, '양배추', 2000, 5, to_date('20220710','yyyy-mm-dd'));
commit;
delete from product where product_id = 21;

-- 6. 탱크로리 상품의 가격을  505000 으로 수정하시오.
update product set price = 505000
where product_name = '탱크로리'

select*from product


select category_id, avg(price)
from product
group by category_id
order by category_id asc

create table testTbl01(
     id number(8) primary key,
     pwd varchar2(20) not null,
     name varchar2(50) not null,
     age number(3)
     );

--drop table testTbl01
insert into testTbl01 values(1, '1234', '홍길동', 18);
insert into testTbl01(id, pwd, name) values(2, '2345', '김영희');
insert into testTbl01 values(3, '4567', '홍길동', 28);

select *
from testTbl01
where age is null;

select *
from product
where price is null



select name, sum(nvl(age,0))
from testTbl01
group by name

select c.category_name, count(*)
from product p, category c
where p.category_id = c.category_id
group by c.category_name
having c.category_name = '전자제품'

select round(1234.567, 2) from dual;

--  상품 테이블에서 카테고리 별로 상품의 개수, 최고가격, 평균가격, 최저가격을 구하시오.
select c.category_name, count(*) as count, sum(p.price) as sum, 
     max(p.price) as max, min(p.price) as min
from product p, category c
where p.category_id = c.category_id
group by c.category_name

--  상품 테이블에서 카테고리 별로 상품의 개수, 최고가격, 평균가격, 최저가격을 구하되
--  상품의 합계 금액이 50000원 이상인 상품만 조회하시오.
select c.category_name, count(*) as count, sum(p.price) as sum, 
     max(p.price) as max, min(p.price) as min
from product p, category c
where p.category_id = c.category_id
group by c.category_name
having sum(p.price) >= 50000

-- 2000원짜리 상품이 있는 카테고리를 모두 조회하시오.
select *
from product
where price = 2000

select *
from product
where price in (select )


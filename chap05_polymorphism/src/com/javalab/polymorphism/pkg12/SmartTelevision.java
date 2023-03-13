package com.javalab.polymorphism.pkg12;

/**
 * 다중 구현 클래스 
 * - 여러개의 인터페이스를 상속한 클래스 
 * - 상소한 인터페이스가 갖고 있는 모든 추상 메소드를 구현해야 한다. 
 * 리모컨 기능인터페이스 + 검색 기능 인터페이스 동시에 구현[다중 인터페이스 구현] 
 * 리모컨 작동도 되고 동시에 검색 기능도 갖춘 TV
 */
public class SmartTelevision implements RemoteControl, Searchable {
	private int volume; // (멤버 변수 필드)

	// turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	/**
	 * 볼륨값을 세팅(저장)하기 전에 검증하고 이상없으면 세팅
	 */
	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨은 " + this.volume + "입니다.");
	}
	
	// 검색 기능 추가 seach() 추상 메소드 오버라이딩
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}

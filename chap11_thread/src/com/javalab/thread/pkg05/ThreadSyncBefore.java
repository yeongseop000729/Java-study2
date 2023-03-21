package com.javalab.thread.pkg05;

/*
 * 비동기화로 인하여 잔액이 마이너스가 되는 문제 예제
 * 잔액이 마이너스가 된다. 잔액이 남아 있음을 확인하고 출금을 하려는 순간에
 * 다른 스레드가 끼어들어와서 출금을 해버린다.[동기화(Synchronize) 필요]
 */


public class ThreadSyncBefore {
	public static void main(String args[]) {
		Runnable r = new RunnableEx21();
		// 두 개의 스레드를 생성/실행시켜서 경쟁적으로 출금
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
	}
} // end class

// 은행 계정 클래스
class Account1 {
	private int balance = 1000; // 초기 잔액을 1000으로 세팅

	// 잔액 확인 메소드
	public int getBalance() {
		return balance;
	}

	// 출금 메소드
	public void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			balance -= money; // 잔액 - 출금액 차감
		}
	}
}

// 출금을 실행하는 스레드 클래스
class RunnableEx21 implements Runnable {
	Account1 acc = new Account1(); // 은행 계정 객체 생성

	public void run() {
		while (acc.getBalance() > 0) { // 은행 계정 클래스에서 잔액 확인
			// 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw((money)); // 출금
			System.out.println("balance:" + acc.getBalance());
		}
	}

}

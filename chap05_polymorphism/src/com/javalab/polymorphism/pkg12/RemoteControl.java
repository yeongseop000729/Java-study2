package com.javalab.polymorphism.pkg12;

/**
 * 리모컨 기능만 있는 TV
 */

public interface RemoteControl {
	// 상수 필드 (상수 앞에는 public static이 생략됨)
	// 인터페이스의 상수는 public static이기 떄문에 인터페이스 이름.상수로 접근
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	
}

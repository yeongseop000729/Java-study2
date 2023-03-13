package com.javalab.polymorphism.pkg11;

// 구현 클래스
public class Audio implements RemoteControl {

	// 필드
	private int volume;

	// turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("Audio를 킵니다.");

	}

	// turnOff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");

	}

	// setVolume() 추상 메소드 오버라이딩 (setter)
	@Override
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) { // RemoteControl.MAX_VOLUME = static이기에 바로 접근가능
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);

	}

}

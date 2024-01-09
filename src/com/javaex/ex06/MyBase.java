package com.javaex.ex06;

public class MyBase extends Base{

	//코드작성
	private String state;

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public void service(String state) {
		setState(state);
		super.service(state);
	}
	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}
	public void night() {
		if ("밤".equals(state)) {
			System.out.println("밤에는 숙면");
		} else {
			System.out.println("오후에도 낮과 마찬가지로 공부해야 합니다.");
		}
	}

}

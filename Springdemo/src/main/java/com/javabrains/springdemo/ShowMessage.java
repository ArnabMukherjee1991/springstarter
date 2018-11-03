package com.javabrains.springdemo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ShowMessage {
	@Setter
	private String message;

	public void printMessage() {
		System.out.println(message);
	}

}

package com.example.demo.entity.enums;

public enum Magnitude {
	Low("Low"), Medium("Medium"), High("High");
	private final String name;

	private Magnitude(String name) {
		this.name = name;
	}
}

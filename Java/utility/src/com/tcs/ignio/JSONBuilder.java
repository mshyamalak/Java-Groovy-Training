package com.tcs.ignio;

public class JSONBuilder {
	private JSONBuilder() {

	}

	public String parse() {
		return "hello";

	}

	public static JSONBuilder build() {
		return new JSONBuilder();
	}

}
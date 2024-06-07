package com.customExceptions;

public class StringTestClass {

	public static void main(String[] args) {

		try {
			StringOperations.getCharacterFromString("Welcome to Java Program", 7);
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}

	}

}

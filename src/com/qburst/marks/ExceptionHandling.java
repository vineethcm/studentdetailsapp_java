package com.qburst.marks;

import java.io.IOException;
import java.io.InputStream;



public class ExceptionHandling {

	public class PassExceptions extends Exception {

		public PassExceptions(String message) {
			System.out.println(message);

		}

	}

	public class InvalidExceptions extends Exception {
		public InvalidExceptions(String message) {
			super(message);
			// System.out.println(message);
		}
		
}
}
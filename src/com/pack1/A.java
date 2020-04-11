package com.pack1;

public class A {

	public static void main(String[] args) {

		pattern_A1();
		System.out.println("=============================================================");
		pattern_A2();
		System.out.println("=============================================================");
		 pattern1();
		System.out.println("=============================================================");
		 pattern2();
		System.out.println("=============================================================");
		 pattern3(6);
		System.out.println("=============================================================");
		 pattern4(6);
		System.out.println("=============================================================");
		 pattern5(6);
		System.out.println("=============================================================");
		 pattern6(6);

	}

	private static void pattern_A2() {
		for (int line = 1; line <=5; line++) {
           for(int element =1;element <5;element++) {
        	   if(line==element) {
        		   System.out.print(0);
        	   }
        	   System.out.print(element);
           }
           System.out.println();
		}

	}

	private static void pattern_A1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

	private static void pattern1() {

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	private static void pattern2() {
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

	private static void pattern3(int height) {

		for (int line = 0; line <= height; line++) {
			for (int space = height; space > line; space--) {
				System.out.print(" ");
			}
			for (int i = 1; i <= line; i++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}

	private static void pattern4(int height) {
		for (int line = 0; line <= height; line++) {
			for (int space = height; space > line; space--) {
				System.out.print(" ");
			}
			for (int i = 1; i <= line; i++) {
				// System.out.print(" "+line);
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	private static void pattern5(int height) {
		for (int line = 0; line <= height; line++) {
			for (int space = height; space > line; space--) {
				System.out.print(" ");
			}
			for (int i = 1; i <= line; i++) {
				// System.out.print(line);
				// System.out.print("*");
				System.out.print(+i);
			}

			System.out.println();
		}
	}

	private static void pattern6(int height) {
		for (int line = 0; line <= height; line++) {
			for (int space = height; space > line; space--) {
				System.out.print(" ");
			}
			for (int i = 1; i <= line; i++) {
				// System.out.print(" "+line);
				System.out.print(" *");
				System.out.print("    ");
			}
			System.out.println();
		}
	}
}

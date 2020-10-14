package com.ordestiny.tdd.conditional;

import java.util.Scanner;

public class StatementsTest {
	private Statements object = new Statements();

	@Test
	void ifElseIfTest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 10 and 99999 whose no. of digits is to be found: ");
		int input = sc.nextInt();
		object.ifElseIf(input);
	}

	@Test
	void switchStatementTest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		Double input1 = sc.nextDouble();
		System.out.println("Enter second number: ");
		Double input2 = sc.nextDouble();
		System.out.println("Choose an operator: +, -, *, or /: ");
		char operator = sc.next().charAt(0);
		object.switchStatement(input1, operator, input2);
	}
}
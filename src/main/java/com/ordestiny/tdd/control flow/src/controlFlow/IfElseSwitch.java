package controlFlow;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String s="";
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	switch(n) {
	case 1:
		s="Sunday";
		break;
	case 2:
		s="Monday";
		break;
	case 3:
		s="Tuesday";
		break;
	case 4:
		s="Wednesday";
		break;
	case 5:
		s="Thursday";
		break;
	case 6:
		s="Friday";
		break;
	case 7:
		s="Saturday";
		break;
	default:
		s="invalid input";
	}
	if(n>=1&&n<=7) {
	if(n==1||n==7) {
		System.out.println(s+" is a complete holiday");
	}
	else if(n==4) {
		System.out.println(s+" is a half day");
	}
	else {
		System.out.println(s+" is a working day");
	}
	}
	else {
		System.out.println(s);
	}

	}

}

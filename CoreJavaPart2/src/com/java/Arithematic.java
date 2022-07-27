package com.java;

class sums{
	
	int add(int a ,int b) {
		System.out.println("Addition is " +(a+b));
		return a+b;
	}
	int sub(int a ,int b) {
		System.out.println("Substration is " +(a-b));
		return a-b;
	}
	int mul (int a ,int b) {
		System.out.println("Multiplication is " +(a*b));
		return a*b;
	}
	int div(int a ,int b) {
		System.out.println("division  is " +(a%b));
		return  a%b;
	}
	int mod(int a ,int b) {
		System.out.println("Mod  is " +(a/b));
		return  a/b;
	}
}

public class Arithematic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sums s1 =new sums();
		s1.add(1, 3);
		s1.sub(1, 9);
		s1.mul(9, 8);
		s1.div(9, 5);
		s1.mod(1, 9);
	}

}

package com.method.practice;

public class MyMethodPractice1Parameter {

	public static void main(String[] args) {
	add(5,5);
	sub(55,20);
	multi(30,20);
	divide(55,6);
	divide(55,5);
	

	}
	public static void add(int john,int ron){
		int result= john+ron;
		System.out.println(result);
	}
	public static void sub(int john,int ron){
		int result=john-ron;
		System.out.println("this is the result"+result);
	}
public static void multi(int v, int x){
	int result=v*x;
	System.out.println(result);
	
}
public static void divide(double tuna,double bassy){
	double result=tuna/bassy;
	System.out.println(result);
}
public static void divide(int tuna,int bassy){
	int result=tuna/bassy;
	System.out.println(result);
}
}

package com.zaojiao.core.controller;

public class test {
public static void main(String[] args) {
	String a="1"+"aa";
	String a1=new String(a);
	if(a==a1){
		System.out.println(1);
	}else if(a.equals(a1)){
		System.out.println(2);
		}
	else{
		System.out.println(0);
	}
}
	
	
}

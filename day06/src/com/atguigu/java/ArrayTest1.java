package com.atguigu.java;

public class ArrayTest1 {
	public static void main(String[] args) {
		
		//5.数组元素的默认初始化值
		int[] arr = new int[2];
		for(int i = 0;i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("*****");
		short[] arr1 = new short[2];
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("*****");
		float[] arr2 = new float[2];
		for(int i = 0;i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("*****");
		char[] arr3 = new char[2];
		for(int i=0;i<arr3.length;i++) {
			System.out.println("--" + arr3[i] + "**");
		}
		if(arr3[0] == 0) {
			System.out.println("true,==0哦");
		}
		
		System.out.println("*****");
		boolean[] arr4 = new boolean[2];
		System.out.println(arr4[0]);
		
		System.out.println("*****");
		String[] arr5 = new String[2];
		System.out.println(arr5[0]);
		if(arr5[0] == null) {
			System.out.println("String类型是null");
		}
		
	}
}

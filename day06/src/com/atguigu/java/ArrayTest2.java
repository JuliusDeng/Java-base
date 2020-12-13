package com.atguigu.java;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		int [] arr = new int[]{1,2,3};
		int [][] arr1 = new int [][]{{1,2}, {3,4,5}, {6,7}};
		
		String[][] arr2 = new String[3][2];
		String[][] arr3 = new String[3][];
		
		int[] arr4[] = new int[][]{{1,2}, {3,4,5}, {6,7}};
		int[] arr5[] = {{1,2}, {3,4,5}, {6,7}};
		
		// 调用二位数组
		System.out.println(arr1[0][1]);
		System.out.println(arr2[1][1]);
		
		arr3[1] = new String[4];
		System.out.println(arr3[1][0]);
		
		// 获取数组长度
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		
		System.out.println("*****");
		// 遍历二位数组
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j< arr1[i].length; j++) {
				System.out.println(arr1[i][j]);
			}
		}
		
	}
	
}

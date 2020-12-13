package com.atguigu.java;

public class ArrayTest {
	public static void main(String[] args) {
		
		//1.1 静态初始化:数组的初始化和数组元素的赋值操作同时进行
		int [] ids;
		ids = new int[] {1,2,3};
		System.out.println(ids);
		
		//1.2动态初始化(没有赋值):数组的初始化和数组元素的赋值操作分开进行
		String[] names = new String[5];
		
		//总结：数组一旦初始化完成，其长度就确定了。
		
		//赋值和调用
		names[0] = "张三";
		names[3] = "李四";
		System.out.println(names);
		
		// 遍历数组
		for(int i = 0;i < names.length; i++) {
			System.out.println(names[i]);
		}
		
	}
}

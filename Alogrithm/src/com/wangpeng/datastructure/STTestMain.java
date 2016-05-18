package com.wangpeng.datastructure;

import java.util.Scanner;

class Data3 {
	String name;
	int age;
}

class StackType {
	static final int MAXINT = 50;
	Data3[] data3array = new Data3[MAXINT]; // 数据元素
	int top; // 栈指针

	// 栈的初始化
	public StackType initStack() {
		StackType st;
		if ((st = new StackType()) != null) {
			st.top = 0; // 初始化为空栈
			return st;
		}
		return null;
	}

	// 判断栈空
	public boolean isEmpty(StackType st) {
		return st.top == 0;
	}

	// 判断栈满
	public boolean isFull(StackType st) {
		return st.top == MAXINT;
	}

	// 清空栈数据
	public void cleanStackType(StackType st) {
		// 不是将里面的data数据置为null,直接将栈赋值为空
		if (st != null) {
			st = null;
		}
	}

	// 释放栈内存
	public void releaseStackType(StackType st) {
		st.top = 0;
	}

	// 插入栈
	public int pushStackType(StackType st, Data3 ndata) {
		if (isFull(st)) { // 手动判断(st.top+1)>MAXINT
			System.out.println("栈满了");
			return 0;
		}
		st.data3array[++st.top] = ndata;
		return 1;
	}

	// 移除栈
	public Data3 popStackType(StackType st) {
		if (isEmpty(st)) {
			System.out.println("pop栈为空");
			System.exit(0); // 退出
		}
		Data3 data = st.data3array[st.top--];
		return data;
	}

	public Data3 getTopData(StackType st) {
		if (st.isEmpty(st)) {
			System.out.println("栈空,不能读取");
		}
		Data3 data = st.data3array[st.top];
		return data;
	}
}

public class STTestMain {
	public static void main(String[] args) {
		StackType st1 = new StackType();
		StackType stack = st1.initStack();
		Data3 data1 = new Data3();
		Scanner input = new Scanner(System.in);
		System.out.println("入栈操作");
		System.out.println("输入姓名和年龄：");
		do{
			Data3 data = new Data3();
			data.name = input.next();
			if("0".equals(data.name)){
			  break;
			}else{
				data.age = input.nextInt();
				st1.pushStackType(stack, data);
			}
		}while(true);
		String temp = "";
		System.out.println("出栈:按任意非零键操作");
		temp = input.next();
		while(!temp.equals("0")){
			data1 = st1.popStackType(stack);
			System.out.println("出栈的数据name:"+data1.name+"--age:"+data1.age);
			temp = input.next();
		}
		System.out.println("操作结束");
		st1.cleanStackType(st1);
		st1.releaseStackType(st1);
	}
}

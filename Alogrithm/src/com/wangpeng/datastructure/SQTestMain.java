package com.wangpeng.datastructure;

import java.util.Scanner;

class Data4 {
	String name;
	int age;
}

class SQType {
	static final int QUENUEMAX = 15;
	Data4[] data4array = new Data4[QUENUEMAX];
	int head;
	int tail;

	// 定义队列
	SQType initSQType() {
		SQType sq = null;
		if ((sq = new SQType()) != null) {
			sq.head = 0;
			sq.tail = 0;
		}
		return sq;
	}

	// 判断队列空
	boolean isEmpty(SQType sq) {
		if (sq.head == sq.tail) {
			System.out.println("队列空");
			return true;
		}
		return false;
	}

	// 判断队列满
	boolean isFull(SQType sq) {
		if (sq.tail == QUENUEMAX) {
			System.out.println("队列满");
			return true;
		}
		return false;
	}

	// 清空
	void cleanSQType(SQType sq) {
		if (sq != null) {
			sq.head = 0;
			sq.tail = 0;
		}
	}

	// 释放
	void releaseSQType(SQType sq) {
		if (sq != null) {
			sq = null;
		}
	}

	// 入队列
	SQType pushSQType(SQType sq, Data4 data) {
		if (sq.isFull(sq)) {
			System.out.println("入队，队列满");
		} else {
			sq.data4array[sq.tail++] = data;
		}
		return sq;
	}

	// 出队列
	Data4 popSQType(SQType sq) {
		Data4 data = null;
		if (sq.isEmpty(sq)) {
			System.out.println("入队，队列空");
		} else {
			data = sq.data4array[sq.head++];
		}
		return data;
	}
}

public class SQTestMain {

	public static void main(String[] args) {
		SQType st = new SQType();
		Data4 data1;
		Scanner input = new Scanner(System.in);
		SQType sq = new SQType();
		System.out.println("入栈操作");
		System.out.println("输入姓名，年龄，进行入队操作");
		do{
			Data4 data = new Data4();
			data.name = input.next();
			if(data.name.equals("0")){
				break;
			}else{
				data.age = input.nextInt();
				sq.pushSQType(sq, data);
			}
		}while(true);
		System.out.println("出队列操作:任意非0键进行操作");
		String temp = input.next();
		while(!temp.equals("0")){
			data1 = sq.popSQType(sq);
			System.out.println("出队的数据data1"+"dataname-->"+data1.name+"  dataage:"+data1.age);
			temp = input.next();
		}
		System.out.println("测试结束");
		sq.releaseSQType(sq);
	}

}

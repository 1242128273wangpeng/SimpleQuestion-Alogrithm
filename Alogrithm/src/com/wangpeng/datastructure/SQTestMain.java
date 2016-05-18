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

	// �������
	SQType initSQType() {
		SQType sq = null;
		if ((sq = new SQType()) != null) {
			sq.head = 0;
			sq.tail = 0;
		}
		return sq;
	}

	// �ж϶��п�
	boolean isEmpty(SQType sq) {
		if (sq.head == sq.tail) {
			System.out.println("���п�");
			return true;
		}
		return false;
	}

	// �ж϶�����
	boolean isFull(SQType sq) {
		if (sq.tail == QUENUEMAX) {
			System.out.println("������");
			return true;
		}
		return false;
	}

	// ���
	void cleanSQType(SQType sq) {
		if (sq != null) {
			sq.head = 0;
			sq.tail = 0;
		}
	}

	// �ͷ�
	void releaseSQType(SQType sq) {
		if (sq != null) {
			sq = null;
		}
	}

	// �����
	SQType pushSQType(SQType sq, Data4 data) {
		if (sq.isFull(sq)) {
			System.out.println("��ӣ�������");
		} else {
			sq.data4array[sq.tail++] = data;
		}
		return sq;
	}

	// ������
	Data4 popSQType(SQType sq) {
		Data4 data = null;
		if (sq.isEmpty(sq)) {
			System.out.println("��ӣ����п�");
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
		System.out.println("��ջ����");
		System.out.println("�������������䣬������Ӳ���");
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
		System.out.println("�����в���:�����0�����в���");
		String temp = input.next();
		while(!temp.equals("0")){
			data1 = sq.popSQType(sq);
			System.out.println("���ӵ�����data1"+"dataname-->"+data1.name+"  dataage:"+data1.age);
			temp = input.next();
		}
		System.out.println("���Խ���");
		sq.releaseSQType(sq);
	}

}

package com.wangpeng.datastructure;

import java.util.Scanner;

class Data3 {
	String name;
	int age;
}

class StackType {
	static final int MAXINT = 50;
	Data3[] data3array = new Data3[MAXINT]; // ����Ԫ��
	int top; // ջָ��

	// ջ�ĳ�ʼ��
	public StackType initStack() {
		StackType st;
		if ((st = new StackType()) != null) {
			st.top = 0; // ��ʼ��Ϊ��ջ
			return st;
		}
		return null;
	}

	// �ж�ջ��
	public boolean isEmpty(StackType st) {
		return st.top == 0;
	}

	// �ж�ջ��
	public boolean isFull(StackType st) {
		return st.top == MAXINT;
	}

	// ���ջ����
	public void cleanStackType(StackType st) {
		// ���ǽ������data������Ϊnull,ֱ�ӽ�ջ��ֵΪ��
		if (st != null) {
			st = null;
		}
	}

	// �ͷ�ջ�ڴ�
	public void releaseStackType(StackType st) {
		st.top = 0;
	}

	// ����ջ
	public int pushStackType(StackType st, Data3 ndata) {
		if (isFull(st)) { // �ֶ��ж�(st.top+1)>MAXINT
			System.out.println("ջ����");
			return 0;
		}
		st.data3array[++st.top] = ndata;
		return 1;
	}

	// �Ƴ�ջ
	public Data3 popStackType(StackType st) {
		if (isEmpty(st)) {
			System.out.println("popջΪ��");
			System.exit(0); // �˳�
		}
		Data3 data = st.data3array[st.top--];
		return data;
	}

	public Data3 getTopData(StackType st) {
		if (st.isEmpty(st)) {
			System.out.println("ջ��,���ܶ�ȡ");
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
		System.out.println("��ջ����");
		System.out.println("�������������䣺");
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
		System.out.println("��ջ:��������������");
		temp = input.next();
		while(!temp.equals("0")){
			data1 = st1.popStackType(stack);
			System.out.println("��ջ������name:"+data1.name+"--age:"+data1.age);
			temp = input.next();
		}
		System.out.println("��������");
		st1.cleanStackType(st1);
		st1.releaseStackType(st1);
	}
}

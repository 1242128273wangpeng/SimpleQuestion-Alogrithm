package com.wangpeng.datastructure;

import java.util.Scanner;

class Data2 {
	String key;
	String name;
	int age;

	public Data2() {
		super();
	}

	public Data2(String k, String n, int age) {
		this.key = k;
		this.name = n;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Data2 [key=" + key + ", name=" + name + ", age=" + age + "]";
	}
}

class CLclass {
	
	Data2 data = new Data2();
	CLclass nextCLclass;
	
	public static CLclass CLaddEnd(CLclass head, Data2 nodedata) { // ĩβ׷�ӽڵ�
		CLclass node, headtmp;
		if ((node = new CLclass()) == null) {
			System.out.println("�ڴ�����ʧ��");
			return null;
		}
		node.data = nodedata; // ������ֵ
		node.nextCLclass = null; // ����Ϊδ�ڵ�
		if (head == null) {
			head = node; // ��������û�нڵ㣬headֱ��ָ���´�����node
			return head;
		}
		headtmp = head;
		while (headtmp.nextCLclass != null) {
			headtmp = headtmp.nextCLclass;
		}
		headtmp.nextCLclass = node;
		return head;
	}

	public static CLclass CLaddFirst(CLclass head, Data2 nodedata) {
		CLclass node;
		if ((node = new CLclass()) == null) {
			System.out.println("�ڴ�����ʧ��");
			return null;
		} else {
			node.data = nodedata;
			node.nextCLclass = head;
			head = node;
			return head;
		}
	}

	public static CLclass CLfindNode(CLclass head, String key) {
		CLclass headtmp;
		headtmp = head;
		while (headtmp != null) {
			if (headtmp.data.key.compareTo(key) == 0) {
				return headtmp;
			}
			headtmp = headtmp.nextCLclass;
		}
		return null;
	}

	public static CLclass CLinsertNode(CLclass head, String findkey, Data2 nodedata) {
		CLclass node, nodetmp;
		if ((node = new CLclass()) == null) {
			System.out.println("�ڴ�����ʧ��");
			return null;
		} else {
			node.data = nodedata;
			nodetmp = CLfindNode(head, findkey);
			if (nodetmp != null) {
				node.nextCLclass = nodetmp.nextCLclass;
				nodetmp.nextCLclass = node;
			} else {
				System.out.println("δ�ҵ�");
			}
		}
		return head;
	}

	// ������findȥ����Keyֵ����ɾ���㣬��ɾ����
	// ��Ϊ���ܻ�ȡ��ǰһ���ڵ㣬�޷���ָ��ǰһ����Ľڵ�nextָ��ָ��ɾ�������Ľڵ�
	public static CLclass CLdeleteNode(CLclass head, String key) {
		CLclass node, headtmp;
		node = head;
		headtmp = head;
		while (headtmp != null) {
			if (headtmp.data.key.compareTo(key) == 0) {
				node.nextCLclass = headtmp.nextCLclass;
				headtmp = null;
			} else {
				node = headtmp;
				headtmp = headtmp.nextCLclass;
			}
		}
		return head;
	}

	public static int CLlength(CLclass head) {
		CLclass headtmp;
		int length = 0;
		headtmp = head;
		while (headtmp != null) {
			length += 1;
			headtmp = headtmp.nextCLclass;
		}
		return length;
	}

	public static void CLdisplay(CLclass head) {
		CLclass headtmp = null;
		Data2 nodedata = null;
		int count = 0;
		headtmp = head;
		System.out.println("��ǰ�ܹ��нڵ���" + CLlength(head));
		while (headtmp!= null) {
			nodedata = headtmp.data;
			System.out.println("�ڵ�����Ϊ��" + nodedata.toString());
			headtmp = headtmp.nextCLclass;
		}
	}

}

public class CLTestMain {
	// testmain
	public static void main(String agrs[]) {
//         CLclass clclass = new CLclass();
//         CLclass.CLaddEnd(clclass, new Data2("23", "wangpeng", 20));
//         CLclass.CLdisplay(clclass);
		CLclass node,head = null;
		CLclass CL = new CLclass();
		String key,findkey;
		Scanner input = new Scanner(System.in);
		System.out.println("�������,���������ݣ���ʽΪ:�ؼ��� ���� ����");
		do{
			Data2 nodedata = new Data2();
			nodedata.key = input.next();
//			System.out.println("input key");
			if(nodedata.key.equals("0")){
//				System.out.println("break");
				break;
			}else{
				nodedata.name = input.next();
				nodedata.age = input.nextInt();
				head = CLclass.CLaddEnd(head, nodedata);
				System.out.println("add");
			}
		}while(true);
		CLclass.CLdisplay(head); // ��ʾ���нڵ�
		System.out.println("����ڵ�,�������ڵ�λ�õĹؼ���");
		findkey = input.next(); // ����ڵ�Ĺؼ���
		System.out.println("�������ڵ�Ĺؼ��� ���� ����");
		Data2 nodeData = new Data2();
		// �������ڵ�����
		nodeData.key = input.next();
		nodeData.name = input.next();
		nodeData.age = input.nextInt();
		head = CLclass.CLinsertNode(head, findkey, nodeData);// ���ò���ڵ������ 
		CLclass.CLdisplay(head);// ��ʾ���нڵ�
		System.out.println("ɾ���ڵ㣬����Ҫɾ���ڵ�Ĺؼ���");
		key = input.next();
		node = CLclass.CLdeleteNode(head, key);
		CLclass.CLdisplay(head);
		System.out.println("���ҽ�㣬������ҽ��Ĺؼ���");
		key = input.next();
		node = CLclass.CLfindNode(head, key);
		if(node!=null){
			nodeData = node.data;
			System.out.println("key:"+key+"-->"+"name��"+nodeData.name+"  age:"+nodeData.age);
		}else{
			System.out.println("û�в��ҵ�");
		}
	}
}

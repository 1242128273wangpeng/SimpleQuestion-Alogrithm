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
	
	public static CLclass CLaddEnd(CLclass head, Data2 nodedata) { // 末尾追加节点
		CLclass node, headtmp;
		if ((node = new CLclass()) == null) {
			System.out.println("内存申请失败");
			return null;
		}
		node.data = nodedata; // 保存数值
		node.nextCLclass = null; // 设置为未节点
		if (head == null) {
			head = node; // 参数链表没有节点，head直接指向新创建的node
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
			System.out.println("内存申请失败");
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
			System.out.println("内存申请失败");
			return null;
		} else {
			node.data = nodedata;
			nodetmp = CLfindNode(head, findkey);
			if (nodetmp != null) {
				node.nextCLclass = nodetmp.nextCLclass;
				nodetmp.nextCLclass = node;
			} else {
				System.out.println("未找到");
			}
		}
		return head;
	}

	// 不能用find去查找Key值查找删除点，再删除。
	// 因为不能获取到前一个节点，无法将指针前一个点的节点next指针指向删除点后面的节点
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
		System.out.println("当前总共有节点数" + CLlength(head));
		while (headtmp!= null) {
			nodedata = headtmp.data;
			System.out.println("节点数据为：" + nodedata.toString());
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
		System.out.println("链表测试,先输入数据，格式为:关键字 姓名 年龄");
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
		CLclass.CLdisplay(head); // 显示所有节点
		System.out.println("插入节点,输入插入节点位置的关键字");
		findkey = input.next(); // 输入节点的关键字
		System.out.println("输入插入节点的关键字 姓名 年龄");
		Data2 nodeData = new Data2();
		// 输入插入节点数据
		nodeData.key = input.next();
		nodeData.name = input.next();
		nodeData.age = input.nextInt();
		head = CLclass.CLinsertNode(head, findkey, nodeData);// 调用插入节点的数据 
		CLclass.CLdisplay(head);// 显示所有节点
		System.out.println("删除节点，输入要删除节点的关键字");
		key = input.next();
		node = CLclass.CLdeleteNode(head, key);
		CLclass.CLdisplay(head);
		System.out.println("查找结点，输入查找结点的关键字");
		key = input.next();
		node = CLclass.CLfindNode(head, key);
		if(node!=null){
			nodeData = node.data;
			System.out.println("key:"+key+"-->"+"name："+nodeData.name+"  age:"+nodeData.age);
		}else{
			System.out.println("没有查找到");
		}
	}
}

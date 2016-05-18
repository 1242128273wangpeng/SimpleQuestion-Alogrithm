package com.wangpeng.javaquestion;

public class Singleton {
	private int age;
	private String name;
	private boolean gender;
	private static Singleton studenta;
	private static Singleton studentb = new Singleton();;

	private Singleton() {

	}

	public static Singleton newInstance_a() {

		if (studenta == null) {
			synchronized (Singleton.class) {
				if (studenta != null) {
					studenta = new Singleton();
				}
			}
		}
		return studenta;
	}

	public static Singleton newInstance_b() {
		return studentb;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public static void main(String[] args) {

	}

}

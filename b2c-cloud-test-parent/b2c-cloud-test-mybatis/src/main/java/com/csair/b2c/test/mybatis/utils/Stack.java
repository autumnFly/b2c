package com.csair.b2c.test.mybatis.utils;

public class Stack<E> {
	private E[] eles;
	private int index = 0;

	public Stack() {
		super();
		eles = (E[]) new Object[16];
	}

	public void push(E e) {
		eles[index++] = e;
	}

	public E pop() {
		return eles[--index];
	}

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		stack.push("ww");
		System.out.println(stack.pop());
	}
}

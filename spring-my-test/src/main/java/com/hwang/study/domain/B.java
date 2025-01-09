package com.hwang.study.domain;

/**
 * @ClassName B
 * @Author huangjiang07
 * @Date 2025/1/8
 */
public class B {

	private A a;

	public B() {

	}

	public B(A a) {
		this.a = a;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B{a=" + (a == null ? "null" : "A@" + Integer.toHexString(a.hashCode())) + "}";
	}
}

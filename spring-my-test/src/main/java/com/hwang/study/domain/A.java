package com.hwang.study.domain;

/**
 * @ClassName A
 * @Author huangjiang07
 * @Date 2025/1/8
 */
public class A {
	private B b;

	public A(){

	}

	public A(B b) {
		this.b = b;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A{b=" + (b == null ? "null" : "B@" + Integer.toHexString(b.hashCode())) + "}";
	}
}

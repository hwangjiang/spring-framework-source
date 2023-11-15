package com.hwang.study.domain;

/**
 * @ClassName User
 * @Author huangjiang07
 * @Date 2023/11/14
 */
public class User {

	private String name;

	private Integer age;

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public String getName() {
		return name;
	}

	public User() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
}

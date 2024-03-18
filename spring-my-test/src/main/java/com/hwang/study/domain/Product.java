package com.hwang.study.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Product
 * @Author huangjiang07
 * @Date 2023/11/15
 */
@Component
public class Product {
	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", name='" + name + '\'' +
				", account=" + account +
				'}';
	}

	@Value("${product.id}")
	private Integer id;

	@Value("${product.name}")
	private String name;

	@Autowired
	private Account account;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product(String name) {
		this.name = name;
	}
}

package com.example.mall.vo;

import lombok.Data;

@Data
public class Address {
	private Integer addressNo; // Pk
	private String customerMail;
	private String addressDetail;
	private String updateDate;
	private String createDate;
}

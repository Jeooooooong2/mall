package com.example.mall.vo;

import lombok.Data;

@Data
public class Board {
	private Integer ordersNo; // pk
	private String boardContent;
	private String updateDate;
	private String createDate;
}
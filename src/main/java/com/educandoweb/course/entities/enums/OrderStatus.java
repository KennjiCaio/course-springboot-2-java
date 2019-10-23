package com.educandoweb.course.entities.enums;
//Criacao de enum dando um valor especifico para cada item
public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//Dar um get no valor do codigo
	public int getCode() {
		return code;
	}
	
	//Conversor de valor inserido para valor descrito
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}

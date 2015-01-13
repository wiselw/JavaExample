package com.train;

public class HotelOrder extends Order {

	private String hotelName;
	private String roomId;
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public HotelOrder(String orderId, float price,String hotelName,String roomId) {
		super(orderId, price);
		this.hotelName=hotelName;
		this.roomId=roomId;
		// TODO Auto-generated constructor stub
	}

}

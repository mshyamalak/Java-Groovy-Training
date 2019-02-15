package com.tcs.ignio;

public class Geolocation {
	private double lat;
	private double lng;
	public double geoLocation(){
		this.lat=0.0;
		this.lng=0.0;
		return 0.0;
		
	}
	public Geolocation(double lat, double lng) {
		this.lat = lat;
		this.lng = lng;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	

}

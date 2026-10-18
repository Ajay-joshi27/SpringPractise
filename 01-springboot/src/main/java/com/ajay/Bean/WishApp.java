package com.ajay.Bean;

import java.time.LocalDateTime;

public class WishApp {
 
	private LocalDateTime ldt;
	
	
	
	public LocalDateTime getLdt() {
		return ldt;
	}


//setter injection
	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}



	public WishApp() {
		System.out.println("WishApp.WishApp()");
	
	}
	
	
	public String wishMsg(String username)
	{
		return "hlo "+username+" ="+ ldt.getHour();
	}


	
	
}

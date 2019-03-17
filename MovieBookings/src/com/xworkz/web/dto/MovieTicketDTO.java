package com.xworkz.web.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;



public class MovieTicketDTO implements Serializable{
	
	public MovieTicketDTO() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}
	private Double price;
	private String movieName;
	private int noOfTickets;
	private String theatreName;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date dateOfBook;
	private String dayCare;
	private String language;
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public Date getDate() {
		return dateOfBook;
	}
	public void setDate(Date date) {
		this.dateOfBook = date;
	}
	public String getDayCare() {
		return dayCare;
	}
	public void setDayCare(String dayCare) {
		this.dayCare = dayCare;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "MovieTicketDTO [price=" + price + ", movieName=" + movieName + ", noOfTickets=" + noOfTickets
				+ ", theatreName=" + theatreName + ", date=" + dateOfBook + ", dayCare=" + dayCare + ", language=" + language
				+ "]";
	}
	
	
	
	
	

}

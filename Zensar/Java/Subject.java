package com.abc;

import java.util.List;

public class Subject {
	String subject_name;
	int subject_id;
	int price;
	int duration;
	List<Mobile> numbers;
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public List<Mobile> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<Mobile> numbers) {
		this.numbers = numbers;
	}
	

}

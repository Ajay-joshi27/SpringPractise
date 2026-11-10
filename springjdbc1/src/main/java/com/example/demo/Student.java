package com.example.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.util.function.LongBinaryOperator;

public class Student {

	private  int id;
	private String name;
	private File image;
	private File resume;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File f) {
		this.image = f;
	}
	public File getResume() {
		return resume;
	}
	public void setResume(File resume) {
		this.resume = resume;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", image=" + image + ", resume=" + resume + "]";
	}
	
	
	
}

package com.abc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerualizationDeserializationDemo {
	public static void main(String []args) throws FileNotFoundException,IOException, ClassNotFoundException{
		Customer cust = new Customer(100,"Rohit Verma","Ohio");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cust);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Customer cust1 =(Customer)ois.readObject();
		System.out.println(cust1);
	}
}

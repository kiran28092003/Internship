package com.abc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerualizationDeserializationDemo1 {
	public static void main(String []args) throws FileNotFoundException,IOException, ClassNotFoundException{
		Product prod = new Product(101,"KeyBoard","hpCompony");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(prod);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Product prod1 =(Product)ois.readObject();
		System.out.println(prod1);
	}
}

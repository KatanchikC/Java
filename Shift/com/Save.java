package com;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList; 
import java.util.List;      
import java.util.Collections;

public class Save {
	public static void writeInt(List<Integer> data,String name) {
		try {	
			if(data.size()>0){
			File file = new File(name);
			FileWriter fileWriter = new FileWriter(file);
			if (file.createNewFile()){
				System.out.println(" ");
			}
			for( int k=0; k<data.size(); k++){
				fileWriter.write(data.get(k).toString() +"\n");
			}fileWriter.close();
			} else {System.out.println("Файл"+name+"не создан т.к. пуст");
			}
		} catch (IOException e) {
			System.out.println("Произошла ошибка" + e.getMessage());
		}
	}
	
	public static void writeDouble(List<Double> data,String name) {
		try {	if(data.size()>0){
			File file = new File(name);
			FileWriter fileWriter = new FileWriter(file);
			if (file.createNewFile()){
				System.out.println(" ");
			}
			for( int k=0; k<data.size(); k++){
				fileWriter.write(data.get(k).toString() +"\n");
			}fileWriter.close();
			} else {System.out.println("Файл"+name+"не создан т.к. пуст");}
		} catch (IOException e) {
			System.out.println("Произошла ошибка" + e.getMessage());
		}
	}
	
	public static void writeStr(List<String> data,String name) {
		try {	if(data.size()>0){
			File file = new File(name);
			FileWriter fileWriter = new FileWriter(file);
			if (file.createNewFile()){
				System.out.println(" ");
			}
			for( int k=0; k<data.size(); k++){
				fileWriter.write(data.get(k).toString() +"\n");
			}fileWriter.close();
			} else{ System.out.println("Файл"+name+"не создан т.к. пуст");}
		} catch (IOException e) {
			System.out.println("Произошла ошибка" + e.getMessage());
		}
	}
}

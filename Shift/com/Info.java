package com;
import java.util.ArrayList; 
import java.util.List;      
import java.util.Collections;

public class Info {

	    	public static void PrintF (String type,String sum,String min,String max, int size,double average) {
    		System.out.println("\n" + type);
		System.out.println("Кол-во: " +size);
		System.out.println("Сумма: " +sum);
		System.out.println("Среднее значение: " + average);
		System.out.println("Минимальное значение: " +min);
		System.out.println("Максимальное значение: " +max);
}

	public static void FullInt (List<Integer> data) {
	int sum = 0;
	for( int k=0; k<data.size(); k++){
			sum += data.get(k);
	}
	PrintF("Integer: ",Integer.toString(sum),Integer.toString(Collections.min(data)),Integer.toString(Collections.max(data)),data.size(),((double) sum/data.size()));
	}
	
	public static void FullDouble (List<Double> data) {
	double sum = 0;
	for( int k=0; k<data.size(); k++){
			sum += data.get(k);
	}
	PrintF("Double: ",Double.toString(sum),Double.toString(Collections.min(data)),Double.toString(Collections.max(data)),data.size(),(sum/data.size()));
	}	
	public static void FullStr (List<String> data) {
	int sum=0;
	String shortest=data.get(0);
	String longest=data.get(0);
	for (String currentString : data){
		sum += currentString.length();
		if (currentString.length() < shortest.length()) {
            		shortest = currentString; // Обновляем, если нашли более короткую строку
        	}
        	if (currentString.length() > longest.length()) {
            		longest = currentString; // Обновляем, если нашли более  длинную строку
       		}
			}
	PrintF("String: ",Integer.toString(sum),shortest,longest,data.size(),sum/data.size());
	}
	}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList; 
import java.util.List;      
import java.util.Collections;
import com.*;

public class Main {
    	
	public static void main(String[] args) {
		String pathResult= "/home";
		boolean o = false;
		boolean a = false;
		int stat = 0;
		String nameInt = "Integer.txt";
		String nameDouble = "Double.txt";
		String nameStr = "String.txt";
	
		List<String> options = new ArrayList<>();		// Преобразование аргументов в коллекцию
		for (String arg : args){
			options.add(arg);
			}
		
		int i = com.Option.Find(options,"-o");			// Поиск наличия опций
		if (i!=-1){
			o = true;
			pathResult = options.get(i+1);}
		
		i = com.Option.Find(options,"-p");
		if (i!=-1){
			nameInt = options.get(i+1)+nameInt;
			nameDouble = options.get(i+1)+nameDouble;
			nameStr = options.get(i+1)+nameStr;}
		
		i = com.Option.Find(options,"-a");
		if (i!=-1){a = true;}
		
		i = com.Option.Find(options,"-s");	
		if (i!=-1){stat = 1;}
		
		i = com.Option.Find(options,"-f");
		if (i!=-1){stat = 2;}
		
		options = com.Option.collection(options);			// Перезаписываем 
		
		try { 	
			List<Integer> Integers = new ArrayList<>();
			List<Double> Doublers = new ArrayList<>();
			List<String> Strings = new ArrayList<>();
			
			if (a==true){	File fileI = new File(nameInt); // Заранее записываем предыдущие значения в нужные коллекции
					if (fileI.exists()){	
					Scanner scanlastI = new Scanner(new File(nameInt));
					while (scanlastI.hasNextLine()){ 
						String line =scanlastI.nextLine();
						Integers.add(Integer.parseInt(line));
			}
			} else {System.out.println("файл " + nameInt + " не найден");}
					
					File fileD = new File(nameDouble); 
					if (fileD.exists()){
					Scanner scanlastD = new Scanner(new File(nameDouble));
					while (scanlastD.hasNextLine()){ 
						String line =scanlastD.nextLine();
						Doublers.add(Double.parseDouble(line));
			}
			} else {System.out.println("файл " +nameDouble + " не найден");}
					File fileS = new File(nameStr);
					if (fileS.exists()){
					Scanner scanlastS = new Scanner(new File(nameStr));
					while (scanlastS.hasNextLine()){ 
						String line =scanlastS.nextLine();
						Strings.add(line);}
			} else {System.out.println("файл " +nameStr + " не найден");}
			}			
			
			for (String opt: options){ 				// начало программы
				String path = opt;
			Scanner scanner = new Scanner(new File(path));  //Задаем какой файл читать
			while (scanner.hasNextLine()){			// Цикл для чтения построчно файла
				String line = scanner.nextLine();			// Наша переменная с файла
				if (com.Determine.isInteger(line)){			// Проверка на Int
					Integers.add(Integer.parseInt(line));
				} else if (com.Determine.isDouble(line)){		// Проверка на Double
					Doublers.add(Double.parseDouble(line));
				} else {Strings.add(line);
				}
				}
				}
			
			if (o==true){
			com.SaveWithP.writeInt(Integers,pathResult,nameInt);
			com.SaveWithP.writeDouble(Doublers,pathResult,nameDouble);
			com.SaveWithP.writeStr(Strings,pathResult,nameStr);
			}
			else {
			com.Save.writeInt(Integers,nameInt);
			com.Save.writeDouble(Doublers,nameDouble);
			com.Save.writeStr(Strings,nameStr);
			}
			if (stat==2) {com.Info.FullInt(Integers);}
			else if (stat==1) { System.out.println("\n"+"Integer: "+ Integers.size());}
			
			if (stat==2) {com.Info.FullDouble(Doublers);}
			else if (stat==1) { System.out.println("\n"+"Double: "+ Doublers.size());}
			
			if (stat==2) {com.Info.FullStr(Strings);}
			else if (stat==1) { System.out.println("\n"+"String: "+ Strings.size());}
			
		} catch (FileNotFoundException e) {
			System.err.println("Файл не найден: " + e.getMessage());

		}
}
}

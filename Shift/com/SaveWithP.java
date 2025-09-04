package com;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class SaveWithP {

    public static void writeInt(List<Integer> data,String absolutePath,String name) {
        try {
            // Создание объекта Path из абсолютного пути
            absolutePath = absolutePath + "/" + name;
            Path filePath = Paths.get(absolutePath);
	
	    // Перезаписываем файлы в string
	    List<String> datastr = new ArrayList<>();
	    for(int k=0;k<data.size();k++){
	    	datastr.add(Integer.toString(data.get(k)));
	    	}
	    
            // Запись коллекции в файл (каждый элемент на новой строке)
            // Если файл существует, он будет перезаписан. Если нет – создан.
            Files.write(filePath, datastr, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Коллекция успешно записана в файл: " + absolutePath);

        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void writeDouble(List<Double> data,String absolutePath,String name) {
        try {
            // Создание объекта Path из абсолютного пути
            absolutePath = absolutePath + "/" + name;
            Path filePath = Paths.get(absolutePath);
	    List<String> datastr = new ArrayList<>();
	    for(int k=0;k<data.size();k++){
	    	datastr.add(Double.toString(data.get(k)));
	    	}
            // Запись коллекции в файл (каждый элемент на новой строке)
            // Если файл существует, он будет перезаписан. Если нет – создан.
            Files.write(filePath, datastr, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Коллекция успешно записана в файл: " + absolutePath);

        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void writeStr(List<String> data,String absolutePath,String name) {
        try {
            // Создание объекта Path из абсолютного пути
            absolutePath = absolutePath + "/" + name;
            Path filePath = Paths.get(absolutePath);

            // Запись коллекции в файл (каждый элемент на новой строке)
            // Если файл существует, он будет перезаписан. Если нет – создан.
            Files.write(filePath, data, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Коллекция успешно записана в файл: " + absolutePath);

        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

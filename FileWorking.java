package toyShop;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWorking extends FileOperations{

    static String path = "/Users/viktortarkhanov/Desktop/ToyVendingJavaProject/toyShop/HistoryFile.txt";

    @Override
    public void save(String smh){
        try (FileWriter fileWriter = new FileWriter(path)){
            fileWriter.write(smh + "\n");
            fileWriter.flush();
            // return "Строка <"smh + "> - записана в файл: " + path;
        }
        catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("Ошибка записи файла");
        }
    }

    @Override
    public String read() {               // не стал реализовывать бизнес-логику метода, ТЗ не требует функции чтения из файла.
        try (FileReader fileReader = new FileReader(path)){
            // for (String raw : ) {
            return null;
        }
        catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("Ошибка чтения файла");
        }
    }
    
}

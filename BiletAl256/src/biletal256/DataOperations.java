/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biletal256;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author MR256
 */
public class DataOperations {
     public static ArrayList<String> readFromFile(String fileName) {
        ArrayList<String> readList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                readList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readList;
    }
     
 public static void writeToFile(String fileName, ArrayList<String> list) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String element : list) {
                writer.write(element);
                writer.newLine();  // Her elemanın altına yeni bir satır ekler
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  public  static void addDataToFile(String fileName, String newData) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            // true parametresi, dosyanın varsa sonuna ekleme yapılmasını sağlar
            writer.write(newData);
            writer.newLine(); // Her elemanın altına yeni bir satır ekler
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   public static void removeDataFromFile(String fileName, String dataToRemove) {
        ArrayList<String> fileContents = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.equals(dataToRemove)) {
                    fileContents.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Dosyaya güncellenmiş veriyi yazma işlemi
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : fileContents) {
                writer.write(line);
                writer.newLine(); // Her elemanın altına yeni bir satır ekler
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   public static void removeDatawithName(String fileName,String Name) {
        ArrayList<String> fileContents = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // A harfi ile başlamayan satırları listeye ekle
                if (!line.startsWith(Name)) {
                    fileContents.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Dosyaya güncellenmiş veriyi yazma işlemi
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : fileContents) {
                writer.write(line);
                writer.newLine(); // Her elemanın altına yeni bir satır ekler
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

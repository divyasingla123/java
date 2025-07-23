package ACP;
import java.io.*;
public class filehandling{
    public static void createfile(String filename){
        try {
            File file= new File(filename);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
    public static void writefile(String filename){
        try {
            File file= new File(filename);
            if (file.exists()) {
                FileWriter writer = new FileWriter(file); 
                writer.write("Hello, this is a test file.");
                writer.close();
            } else {
                System.out.println("File does not exist.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
    public static void readfile(String filename){
        try {
            File file= new File(filename);
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } else {
                System.out.println("File does not exist.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
    public static void deletefile(String filename){
        try {
            File file= new File(filename);
            if (file.exists()) {
                if (file.delete()) {
                    System.out.println("File deleted successfully.");
                }
            }
            else {
                System.out.println("File does not exist.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the file.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String filename = "C:\\Users\\Divya\\Desktop\\example.txt";
        createfile(filename);
        writefile(filename);
        readfile(filename);
        deletefile(filename);
    }
}
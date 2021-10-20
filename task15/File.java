package lab8;

import java.io.*;
import java.util.Scanner;


public class File {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        try {
            FileWriter writer = new FileWriter("notes.txt", false);
            writer.write(text);
            writer.append('\n');

            writer.flush();
            writer.close();

            FileReader reader = new FileReader("notes.txt");
            int c;
            while((c = reader.read()) != -1) {
                System.out.print((char)c);
            } 
            reader.close();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }

        text = scan.nextLine();

        try {
            BufferedReader file = new BufferedReader(new FileReader("notes.txt"));
            StringBuffer inputBuffer = new StringBuffer();
            String line;
    
            while ((line = file.readLine()) != null) {
                line = text;
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            
            file.close();

            FileOutputStream fileOut = new FileOutputStream("notes.txt");
            fileOut.write(inputBuffer.toString().getBytes());

            text = scan.nextLine();
            fileOut.write(text.toString().getBytes());
            fileOut.close();
        } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
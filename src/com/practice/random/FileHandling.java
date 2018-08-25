package com.practice.random;

import java.io.*;

public class FileHandling {
    public static void main (String [] args) throws IOException{

        File f1= new File("C:/Test/FileHandling.txt");

        try{
            boolean fileCreation = f1.createNewFile();
            String content = "This is a demo for file handling \nTyring to enter second line";
            FileWriter fstream = new FileWriter(f1);
            BufferedWriter write = new BufferedWriter(fstream);
            write.write(content);
            write.close();
            fstream.close();


            File secFile = new File("C:/Test/FileHandling1.txt");
            fileCreation = secFile.createNewFile();
            FileWriter fstream1 = new FileWriter(secFile);
            BufferedWriter write1= new BufferedWriter(fstream1);
            write1.write("This is file 2.");
            write1.close();
            fstream1.close();

           FileReader readStream = new FileReader(secFile);
           BufferedReader reader = new BufferedReader(readStream);

        }
        catch (IOException e){
            throw new IOException(e);
        }
    }

}

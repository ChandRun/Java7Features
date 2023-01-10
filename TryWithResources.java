package com.jfsd.java7;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import  java.io.IOException;
import java.io.FileReader;

public class TryWithResources {
    public static void main(String[] args){
        System.out.println("Demo to show Try with Resources");
        beforeJava7();
//        withJava7();
//        withCustomResInJava7();
    }

/* Sample implementation before Java 7
* @Throws IOException
* */
    public static void beforeJava7() throws IOException{
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("\"data_file.txt"));
            String sCurrentLine;
            while ((sCurrentLine = br.readline()) != null){
                System.out.println(sCurrentLine);
            }
        }
    }

    public static void withJava7() throws FileNotFoundException, IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("\"data_file.txt"))){
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null){
                System.out.println(sCurrentLine);
            }
        }
    }
    public static void withCustomResInJava7() throws Exception{
        try(CustomResource cr new CustomResource();){
            cr.readFromResrouce();
        }
    }
}

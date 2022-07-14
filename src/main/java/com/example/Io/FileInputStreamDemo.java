//package com.example.Io;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//
//public class FileInputStreamDemo {
//
//    public static void main(String[] args) {
//
//        FileInputStreamDemo fis = null;
//
//        try{
//            fis = new FileInputStream((new File("/Users/arquivo/document.txt")));
//            System.out.println("File Opened");
//
//            int i;
//            while((i = fis.read()) != -1){
//                System.out.println((char) i);
//            }
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            fis.close();
//            System.out.println("file closed");
//        }
//    }
//
//    private int read() {
//    }
//
//}


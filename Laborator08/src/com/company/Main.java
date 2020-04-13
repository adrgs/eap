package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        try {
//            DataOutputStream dataOutputStream = null;
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Numele fisierului este:");
//            String fileName = scanner.nextLine();
//            dataOutputStream = new DataOutputStream(new FileOutputStream(fileName));
//
//            System.out.println("Nr de elemente: ");
//            int n = scanner.nextInt();
//            dataOutputStream.writeInt(n);
//
//            System.out.println("Elementele sunt:");
//            for (int i=0;i<n;i++)
//            {
//                dataOutputStream.writeDouble(scanner.nextDouble());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("file1.txt"))){
//
//            int n = dataInputStream.readInt();
//            System.out.println("n = " + n);
//
//            System.out.println("Elementele sunt:");
////            for (int i=0;i<n;i++) {
////                System.out.print(dataInputStream.readDouble() + " ");
////            }
//            while (dataInputStream.available() >= 8)
//            {
//                System.out.print(dataInputStream.readDouble() + " ");
//            }
//            System.out.println();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try(PrintWriter printWriter = new PrintWriter("string-file.txt")) {
//
//            printWriter.println("Salut!");
//            printWriter.printf("Eu sunt in anul %d si am %d ani.\n", 2, 20);
//            printWriter.println("Tu ce faci?");
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("string-file.txt"))) {
//
//            String line;
//
//            while ((line = bufferedReader.readLine())!=null) {
//                System.out.println(line);
//            }
//            System.out.println("EOF reached");
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Student student = new Student("Popescu","Ionut", 23, 3);
//        System.out.println(student);
//
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serializare.txt"))){
//            objectOutputStream.writeObject(student);
//            System.out.println("Am scris obiectul in fisier");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serializare.txt"))) {
//            Student student = (Student) objectInputStream.readObject();
//
//            if (student != null) {
//                System.out.println(student);
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }



    }
}

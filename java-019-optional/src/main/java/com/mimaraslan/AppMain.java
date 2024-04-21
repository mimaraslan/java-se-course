package com.mimaraslan;


import java.util.Optional;

public class AppMain {
    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student);
        System.out.println(student.getIdNumber());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println("---------------------------");

        Student student2 = new Student("Banu");
        System.out.println("Student 2 - 1. Durum: " + student2);
        System.out.println(student2.getIdNumber());  // null
        System.out.println(student2.getFirstName()); // Banu
        System.out.println(student2.getLastName());  // null
        System.out.println("---------------------------");

        student2 = null;
        System.out.println(student2); // null
/*
        if(student2 != null){
            System.out.println("null değil.");
        }else {
            // FIXME burayı duzeltecegiz
            student2 = new Student();
            student2.setIdNumber(1);
            student2.setFirstName("Banu");
            student2.setLastName("Nur");
            System.out.println("Student 2 - 2. Durum: " + student2);
            System.out.println("Durum: " + student2.getIdNumber());
        }
*/
        try {
           // buradaki kodu dene
            student2.setIdNumber(100);
            student2.setFirstName("Eyşan");
            System.out.println(student2.getIdNumber());  // NullPointerException
            System.out.println(student2.getFirstName()); // NullPointerException
        } catch (Exception e){
            // hata olustu yakaladık
            System.out.println("Hata: " +  e);
        }

        System.out.println("---------------------------");

        String [] myArray = new String[10];
        myArray[6] = "abc";
        String myWord = myArray[6].toUpperCase();
        System.out.println(myWord);

       // System.out.println("Sıra 7: " + myArray[7].trim());

        myArray[6] = null;
      //  System.out.println(myArray[6].toUpperCase());

        System.out.println("---------------------------");

        String[] myArray2 = new String[10];
        myArray2 = null;

        Optional <String[]> nullKontrol = Optional.ofNullable(myArray2);
        System.out.println(nullKontrol);
  //      System.out.println(nullKontrol.get());

        // Loglama dosyalarını mesaj yaz
        if (nullKontrol.isEmpty()){
            System.out.println("Dizi boş");
        } else {
            System.out.println("Dizi dolu");
        }


        // Loglama dosyalarını mesaj yaz
        if (nullKontrol.isPresent()){
            System.out.println("Dizi dolu");
        } else {
            System.out.println("Dizi boş");
        }

        System.out.println("---------------------------");

        String[] myArray3 = new String[10];
        myArray3[9] = "Tunahan"; // String

        Optional <String> nullKontrol3 = Optional.ofNullable(myArray3[9]);
        System.out.println(nullKontrol3);

        System.out.println(nullKontrol3.get());

        if (nullKontrol3.isEmpty()){
            System.out.println("Dizi elemanı boş");
        } else {
            System.out.println("Dizi elemanı dolu: " +  myArray3[9]);
        }


    }


}
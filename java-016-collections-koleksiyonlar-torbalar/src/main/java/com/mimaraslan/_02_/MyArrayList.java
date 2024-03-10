package com.mimaraslan._02_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {

        List <String> listStudent = new ArrayList<>();
        listStudent.add("Uğur");
        listStudent.add("Kürşat");
        listStudent.add("Mustafa");
        listStudent.add("Abdullah");
        listStudent.add("Burak");

      //  Collections.sort(listStudent); // sıralama A'dan Z'ye   0'dan 9'a
         Collections.sort(listStudent, Collections.reverseOrder());

        for (int i = 0; i < listStudent.size() ; i++) {
            System.out.println(listStudent.get(i));
        }
        System.out.println("--------------------------");

        //for each
        for (String student: listStudent){
            System.out.println(student);
        }

        System.out.println("--------------------------");

        listStudent.forEach(student -> System.out.println(student));

        System.out.println("--------------------------");

        Iterator <String> iterator = listStudent.iterator();

        String searchName;
        while (iterator.hasNext()){

            searchName = iterator.next();

            if((searchName == "Mustafa") || (searchName.equals("Uğur")) ){
                iterator.remove();
            }
        }

        System.out.println(listStudent);
    }
}

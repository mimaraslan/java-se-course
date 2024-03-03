package com.mimaraslan;

public class Loop_04_ForEach {

    public static void main(String[] args) {

        String student1 = "Barış";
        String student2 = "İbrahim";
        String student3 = "Emre";
        String student4 = "Osman";

        System.out.println(student1+ ' ' + student2 + ' ' +student3 + ' '+ student4);

        System.out.println("---------------------------");
                             //   0         1          2        3
        String [] students =  {"Barış", "İbrahim",  "Emre", "Osman", "Ertuğrul"};
        System.out.println(students);
        System.out.println(students[0] + ' ' + students[1]+ ' ' + students[2]+ ' ' + students[3] );

        System.out.println("--FOR 1--------");

        for (int i = 0; i < 4 ; i++) {
            System.out.println(students[i]);
        }

        System.out.println("--FOR 2--------");

        for (int i = 0; i < students.length ; i++) {
            System.out.println(students[i]);
        }

        System.out.println("--FOR 3 --String--- FOR EACH---------");

        for ( String student : students){
            System.out.println(student);
        }


        System.out.println("--FOR 3 --int --- FOR EACH---------");

        int [] arrYears =  {2000, 2005,  2008, 2017, 2024};

        for ( int year : arrYears){
            System.out.println(year);
        }





    }
}

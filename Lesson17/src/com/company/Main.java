package com.company;

public class Main {

    public static void main(String[] args) {
        final int size = 3;
        Student[] array = new Student[size];
        Student s1 = new Student("Ivan", "Ivanov", 2121, 4.5);
        Aspirant a1 = new Aspirant("Petr", "Petrov", 21, 5.0);
        Student q1 = new Aspirant("Igor", "Bichukov", 2221, 4.0);
        array[0] = s1;
        array[1] = a1;
        array[2] = q1;
        for (Student s:array){
            System.out.println(s);
            System.out.println("grant=" + s.getScholarShip());
        }
    }
}

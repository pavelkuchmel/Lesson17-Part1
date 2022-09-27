package com.company;

public class Aspirant extends Student{

    public Aspirant(String firstName, String lastName, int group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarShip() {
        int grant = 0;
        if (Math.abs(averageMark - 5.0) < 1E-5) { //дабл не сравнивать на равенство. надо сравнивать на разницу. if(averageMark == 0)
            grant = 200;
        }
        else {
            grant = 100;
        }
        return grant;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", averageMark=" + averageMark +
                '}';
    }
}

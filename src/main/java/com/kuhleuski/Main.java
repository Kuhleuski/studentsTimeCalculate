package com.kuhleuski;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final int AMOUNT_OF_HOURS = 198;

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1));
        list.add(new Student(1));
        list.add(new Student(1));
        list.add(new Student(2));
        list.add(new Student(2));
        list.add(new Student(2));
        list.add(new Student(3));
        list.add(new Student(3));
        list.add(new Student(3));

        for (Student student : list) {
            student.executeStrategy().printCalculateTime();
        }
    }
}

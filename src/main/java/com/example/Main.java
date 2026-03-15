package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dolgozók feldolgozása....");
        List<Employee> empList = Storage.readFile();

        Solution.task01(empList);
        Solution.task02(empList);
    }
}
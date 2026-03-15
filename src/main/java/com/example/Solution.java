package com.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void task01(List<Employee> empList) {

        List<String> cityList = new ArrayList<>();

        for (Employee emp : empList) {
            if (!cityList.contains(emp.getCity())) {
                cityList.add(emp.getCity());
            }
        }

        System.out.println("Városok:");

        for (String city : cityList) {
            System.out.println(city);
        }
    }

    public static void task02(List<Employee> empList) {

        List<String> cityList = new ArrayList<>();

        for (Employee emp : empList) {
            if (!cityList.contains(emp.getCity())) {
                cityList.add(emp.getCity());
            }
        }

        System.out.println("Átlag fizetések:");

        for (String city : cityList) {

            int sum = 0;
            int count = 0;

            for (Employee emp : empList) {
                if (emp.getCity().equals(city)) {
                    sum += emp.getSalary();
                    count++;
                }
            }

            double avg = (double) sum / count;
            System.out.printf("%s - átlag fizetés: %.2f Ft%n", city, avg);
        }
    }
}
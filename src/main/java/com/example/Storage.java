/*
* File: Storage.java
* Author: Gergely Barbara
* Copyright: 2026, Gergely Barbara
* Group: Szoft II
* Date: 2026-03-15
* Github: https://github.com/gergelybarbara/
* Licenc: MIT
*/

package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Storage {

    public static List<Employee> readFile() {
        try {
            return tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
            return new ArrayList<Employee>();
        }
    }

    public static List<Employee> tryReadFile() throws FileNotFoundException {

        List<Employee> empList = new ArrayList<Employee>();

        File file = new File("tulorabt.txt");
        System.out.println("Fájl helye: " + file.getAbsolutePath());

        Scanner sc = new Scanner(file, "UTF-8");

        while (sc.hasNextLine()) {

            String line = sc.nextLine().trim();

            if (line.isEmpty()) {
                continue;
            }

            String[] lineArray = line.split(":");

            Employee emp = new Employee();

            emp.setName(lineArray[0]);
            emp.setMother(lineArray[1]);
            emp.setCity(lineArray[2]);
            emp.setAddress(lineArray[3]);

            String[] birthArray = lineArray[4].split("-");
            Integer year = Integer.parseInt(birthArray[0]);
            Integer month = Integer.parseInt(birthArray[1]);
            Integer day = Integer.parseInt(birthArray[2]);

            emp.setBirth(LocalDate.of(year, month, day));
            emp.setSalary(Integer.parseInt(lineArray[5]));
            emp.setBonus(Integer.parseInt(lineArray[6]));

            empList.add(emp);
        }

        sc.close();
        return empList;
    }
}
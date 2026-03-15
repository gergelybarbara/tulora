/*
* File: Main.java
* Author: Gergely Barbara
* Copyright: 2026, Gergely Barbara
* Group: Szoft II
* Date: 2026-03-15
* Github: https://github.com/gergelybarbara/
* Licenc: MIT
*/

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
package com.syntax.class19;

public class Employee {

        String name;
        int baseSalary = 30000;
        int baseNoDaysOff = 20;

        void printSalary() {
            System.out.println(baseSalary);

        }

        void printBaseNoDaysOff() {
            System.out.println(baseNoDaysOff);
        }

       class Manager extends Employee {
            int bonus=10;
            int travellingAllowance=20;

            void printSalary() {
                super.printSalary();
                System.out.println(baseSalary+bonus+travellingAllowance);
            }
        }
    }



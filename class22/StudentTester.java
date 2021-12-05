package com.syntax.class22;

public class StudentTester {
    public static void main(String[] args){
        Student[] students={new SyntaxStudent(), new CollageStudents(),new RegularStudents() };
        for(Student s:students){
            s.partice();
            s.doHomework();
            s.study();
            if (s instanceof SyntaxStudent){
                ((SyntaxStudent)s).research();
            }
        }

    }
    }

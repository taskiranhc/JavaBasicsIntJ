package com.syntax.class22;

public class Student {
    void study(){
        System.out.println("Student must study");
    }
    void doHomework(){
        System.out.println("Student must do homeworks");
    }
    void partice(){
        System.out.println("Student must practice");
    }
}
class SyntaxStudent extends Student{
    @Override
    void study(){
        System.out.println("Syntax student must study 25 hours in a week");
    }
    @Override
    void doHomework(){
        System.out.println("Syntax student must do repls");
    }
     void research(){
        System.out.println("Syntax student must do addinitional research");
    }
}
class CollageStudents extends Student{
    void doHomework(){
        System.out.println("Collage Student must do homeworks");
    }
}
class RegularStudents extends Student{

}
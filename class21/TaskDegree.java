package com.syntax.class21;

public class TaskDegree {
    /*
     * Create a class 'Degree' having a method 'getPrereuquisite' that prints "To
     * get a degree you need a high school diploma". Class degree has 2 subclasses
     * name 'bachelor' and 'master' In masters class override method
     * 'getPrereuquisite'. Call the method by creating an object for 3 classes
     */

      public void getPrereuquisite() {
        System.out.println("To get a degree you need a high school diploma");
    }
}
class Bachelors extends TaskDegree {

}
class Masters extends TaskDegree {
    public void getPrereuquisite() {
        System.out.println("To get a master you need a bachelor diploma");
    }
}
class tester {
    public static void main(String[] args) {
        TaskDegree degree = new TaskDegree();
        degree.getPrereuquisite();
        Bachelors bachelors = new Bachelors();
        bachelors.getPrereuquisite();
        Masters masters = new Masters();
        masters.getPrereuquisite();
    }
}

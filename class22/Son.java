package com.syntax.class22;

public class Son extends Father {
    Son (String name){
        super(name);
    }
    void sleep(){
        System.out.println(name+" like to sleep 10 hours");
    }
    void eat(){
        System.out.println(name+" like to eat Kebab");
    }
}

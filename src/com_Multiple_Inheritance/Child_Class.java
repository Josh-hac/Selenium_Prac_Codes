package com_Multiple_Inheritance;

public class Child_Class implements Mother_Eg,Father{




    @Override
    public void land() {
        System.out.println("Father's land");

    }

    @Override
    public void gold() {
        System.out.println("mothers gold");

    }
    public static void main(String[] args) {
        Child_Class c=new Child_Class();
        c.gold();
        c.land();

    }
}

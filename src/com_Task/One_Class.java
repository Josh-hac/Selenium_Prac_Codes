package com_Task;

public class One_Class {
    public  void m1(){
        System.out.println("hello");
    }

   public void m2(){
       System.out.println("hy");
   }

    public static void main(String[] args) {
        One_Class a=new Two_Class();
        a.m1();
        a.m2();

    }

}

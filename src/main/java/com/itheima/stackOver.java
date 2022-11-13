package com.itheima;

public class stackOver {

    private static int count;

    public static void main(String[] args) {
        try{
            method1();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(count);
        }
    }

    private static void method1(){
        count++;
        method1();
    }
}

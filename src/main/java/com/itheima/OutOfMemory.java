package com.itheima;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {
    public static void main(String[] args) {
        int i = 0;
        try{
            List<String> list = new ArrayList<>();
            String value = "hello";
            while(true){
                list.add(value);
                value = value + value;
                i++;
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(i);
        }
    }
}

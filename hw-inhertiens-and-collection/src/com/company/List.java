package com.company;

import java.util.*;

public class List {

    public static void main(String[] args) {
        // write your code here

        java.util.List<String> list1 = new ArrayList<String>();
        list1.add("ahmed");
        list1.add("nasser");
        list1.add("mohammed");
        list1.set(1, "khaled");
        System.out.println(list1);

    }
}
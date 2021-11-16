package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

//        (Q1)==============================================================================================================
        System.out.println("\n \n Q1");
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("List befor "+list);
        list.remove(1);
        list.add(1,5);

        System.out.println("List with replace the second element"+list);



//        (Q2)==================================================================================================================
        System.out.println("\n \n Q2");
        PriorityQueue<String> queue= new PriorityQueue<String>();

        queue.offer("Black");
        queue.offer("Pink");
        queue.offer("Orange");
        Iterator<String> iterator= queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




//        (Q3)===================================================================================================================
        System.out.println("\n \n Q3");
        String search1="Red";
        String search2="Pink";
        boolean flag=false;
        Iterator<String> iterator2= queue.iterator();
        while (iterator2.hasNext()){
            String value=iterator2.next();
            if(value.compareTo(search1)==0){
                flag=true;
            }
        }
        if(flag){
            System.out.println("Find "+search1+" in "+queue);
        }else{
            System.out.println("Can not find  "+search1+" in "+queue);
        }
    }
}

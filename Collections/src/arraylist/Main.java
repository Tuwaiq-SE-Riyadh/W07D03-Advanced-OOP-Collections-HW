
package arraylist;
        import java.util.*;
        import java.util.ArrayList;
        import java.util.Scanner;

class arraylist {
    // Main Method

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        ArrayList<String>  color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        System.out.println("Original array list: " + color);

        String new_color=input.nextLine();
        color.set(1,new_color);

        int num=color.size();
        System.out.println("Replace second element ");
        for(int i=0;i<num;i++)
            System.out.println(color.get(i));

        System.out.println(color);
    }
}
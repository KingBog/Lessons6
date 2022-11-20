package Lessons6.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(1,4,5,10,17));
        task2_1(list, list.size()-1);
    }
    public static void task2_1(ArrayList<Integer>list,int i) {
        {
            if (i >= 0) {
                System.out.print(list.get(i)+" ");
                task2_1(list,i-1);
            }

        }
    }
}

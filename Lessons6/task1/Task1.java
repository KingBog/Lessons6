package Lessons6.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 4, 5, 10, 17));
        task1(list,0);
    }
        public static void task1(ArrayList<Integer>list,int i){
            if (i<list.size()){
                System.out.print(list.get(i)+" ");
                task1(list,i+1);
            }
    }
}


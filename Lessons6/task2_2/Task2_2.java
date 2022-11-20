package Lessons6.task2_2;

import java.util.ArrayList;
import java.util.List;

public class Task2_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 4, 5, 10, 17));
        task2_2(list,0);
    }
    public static void task2_2(ArrayList<Integer> list, int i) {
        {
            if (i<list.size()) {
                task2_2(list, i+1);
                System.out.print(list.get(i) + " ");
            }

        }
    }
}

package Lessons6.task3_3;

import java.util.ArrayList;
import java.util.List;

public class Task3_3 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(List.of(1,4,5,10,17));
        ArrayList<String> listS = new ArrayList<>();
        listS.add(null);
        listS.add("Ivan");
        listS.add("Semen");
        listS.add(null);
        listS.add("Viktoria");
        task3_3(listS,0);
    }
    public static void task3_3(ArrayList<String> list, int i){
        if (list.size() >i){
            task3_3(list, i + 1);
            if (list.get(i)!=null) {
                System.out.println(list.get(i));
            }

        }
    }
}

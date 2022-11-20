package Lessons6.task3_2;

import java.util.ArrayList;
import java.util.List;

public class Task3_2 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(List.of(1,4,5,10,17));
        ArrayList<String> listS = new ArrayList<>();
        listS.add(null);
        listS.add("Ivan");
        listS.add("Semen");
        listS.add(null);
        listS.add("Viktoria");
        task3_2(listS, list.size()-1);
    }
    public static void task3_2(ArrayList<String> list, int i){
        if (i>=0){
            if (list.get(i)!=null){
                System.out.println(list.get(i));
            }
            task3_2(list,i-1);
        }

    }
}

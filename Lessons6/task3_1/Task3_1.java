package Lessons6.task3_1;

import java.util.ArrayList;

public class Task3_1 {
    public static void main(String[] args) {

        ArrayList<String> listS = new ArrayList<>();
        listS.add(null);
        listS.add("Ivan");
        listS.add("Semen");
        listS.add(null);
        listS.add("Viktoria");
        task3_1(listS,0);

    }
    public static void task3_1(ArrayList<String> list, int i){
        if (list.size() >i){
            if (list.get(i)!=null) {
                System.out.println(list.get(i));
            }
            task3_1(list, i + 1);
        }
    }
}

package Lessons6.task5;

public class Task5 {
    public static void main(String[] args) {
        task5(5," ");

    }
    public static void task5(int n,String enter){
        if (n>2) {
            System.out.println("#");
            System.out.print("#"+enter);
            task5(n-1,enter+enter);
        }
    }
}

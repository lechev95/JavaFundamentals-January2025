package ProgrammingBasicsOverview.Lab;

public class L08_DivisibleByThree {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}

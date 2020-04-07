import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(100,500,900));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(800,600,300));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(400,700,200));

        ArrayOrganizer a = new ArrayOrganizer();
        list3 = a.concatAndSort(list1, list2, list3);
        System.out.println("Result => " + list3);
        System.out.println("---------------------");

        Player p1 = new Player("Tom");
        Player p2 = new Player("John");
        Player p3 = new Player("James");
        Player p4 = new Player("Henry");

        Die d = new Die();
        for (int i = 0; i < 5; i++){
            p1.addScore(d.rollDie());
            p2.addScore(d.rollDie());
            p3.addScore(d.rollDie());
            p4.addScore(d.rollDie());
        }
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


       
        
    }
}
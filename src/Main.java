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
        
    }
}
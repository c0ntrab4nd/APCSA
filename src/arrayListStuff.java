import java.util.ArrayList;

public class arrayListStuff {
    public static void main(String[] args) {
        ArrayList<Integer> monkee = new ArrayList<Integer>();

        monkee.add(4);
        monkee.add(222);
        monkee.add(99);
        monkee.add(103);
        monkee.add(20);
        monkee.add(76);
        monkee.set(2, 39);
        monkee.add(monkee.size()-1, 49);

        System.out.println(monkee);

        for(Integer animal:monkee){
            System.out.println(animal);

        }

    }
}

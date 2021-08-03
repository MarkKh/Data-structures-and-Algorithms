import java.util.*;

class TestArrayCollectionTask3 {
    public static void main(String[] args) {
        ArrayCollectionTask3 mydata = new ArrayCollectionTask3(10);
        Object d = input();
        mydata.add(d);
        /*for (int i = 1; i <= 4; i++) {
            mydata.add(input());
        }*/
        System.out.println(mydata.size());
    }

    private static Object input() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
}
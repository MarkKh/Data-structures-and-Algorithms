import java.util.*;

class TestArrayCollection {
    public static void main(String[] args) {
        ArrayCollection mydata = new ArrayCollection(10);
        // System.out.println(mydata.size());
        // Object data = input();
        // mydata.add(data);
        for (int i = 1; i <= 5; i++) {
            mydata.add(input());
        }
        boolean b = mydata.contains(input());
        System.out.println(b);

        System.out.println(mydata.search(input()));

        mydata.remove(input());
        System.out.println(mydata.size());
        System.out.println(mydata);
    }

    private static Object input() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
}
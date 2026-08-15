package lang_explore;

public class LangExplore {

    public static void main(String[] args) {
        Integer i = 10;
        System.out.println(i);

        Integer a = Integer.valueOf(10);
        System.out.println(a);

        Object o1 = new Object(); // all functions come from base object
        System.out.println(o1);
        int ji = 110;

        System.out.println(Integer.reverseBytes(ji) + " " + Integer.bitCount(ji) + Integer.BYTES);
    }
}

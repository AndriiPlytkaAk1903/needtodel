import static java.lang.Math.ceil;

public class StringGetCenter {
    public static void main(String[] args) {
        String s = "College of electronic devise";
        int cile = (s.length());
        System.out.println(s.length());

        double polov = ceil(s.length()/2);
        System.out.println(polov);
        char buf [] = new char[(int) polov];
        s.getChars((int)polov, cile, buf, 0 );
        System.out.println(buf);
    }
}

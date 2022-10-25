import java.util.Scanner;

public class StringEqualsScan {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Please enter string: ");
        String n = name.next();
        String c = "Plytka";
        System.out.println("n.equals(c) = " + n.equals(c));
        System.out.println("n.equalsIgnoreCase(c) = " + n.equalsIgnoreCase(c));



    }
}

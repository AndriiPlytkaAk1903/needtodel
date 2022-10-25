import java.util.Scanner;

public class StopString {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Please enter string: ");
        String n = name.next();

        while (!n.equals("Stop")){
            System.out.println(n);
            n = name.next();
        }
        System.out.println("Exit");
    }
}

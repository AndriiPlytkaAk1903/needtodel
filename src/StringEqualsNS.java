public class StringEqualsNS {
    public static void main(String[] args) {
        String a = "Andriy";
        String b= new String("andriy");

        String c = "Plytka";
        String d = "plytka";

        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("a.equalsIgnoreCase(d) = " + a.equalsIgnoreCase(b));
        System.out.println("c.equals(d) = " + c.equals(d));
        System.out.println("c.equalsIgnoreCase(d) = " + c.equalsIgnoreCase(d));
    }
}

public class StringEquals {
    public static void main(String[] args) {
        String a = "StringOperations";
        String b= new String("StringOperations");
        String c = a;
        String d = "stringoperations";
        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("b.equals(a) ="  + b.equals(a));
        System.out.println("a.equals(c) = " + a.equals(c));
        System.out.println("a.equals(d) = " + a.equals(d));
        System.out.println("a.equalsIgnoreCase(d) = " + a.equals(b));
    }
}

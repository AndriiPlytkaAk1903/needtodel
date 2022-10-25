public class StringLength {
    public static void main(String[] args) {
        String name = "MyName";
        System.out.println("Довжина рядка: " + name.length());

        String string = "Hello World";
        String substring1 = "Hello";
        String substring2 = "Test";
        System.out.println(string.indexOf(substring1)); // виводить 0 (true)
        System.out.println(string.indexOf(substring2)); // виводить -1.(false)

        String string1 = "http://google.com";
        System.out.println("Починається з http:// " + string1.startsWith("http://"));
        System.out.println("Починається з ftp:// " + string1.startsWith("ftp://"));
        System.out.println("Закінчується з .com " + string1.endsWith(".com"));
        System.out.println("Закінчується з .com.ua "  + string1.endsWith(".com.ua"));
    }
}

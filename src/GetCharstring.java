import java.util.Arrays;

public class GetCharstring {
    public static void main(String[] args) {
        String s ="Це демонстрація getChars методу";
        int start = 16;
        int end = 30;
        char buf[] = new char[end - start];
        Arrays.fill(buf, '.');
        System.out.println(end);
        System.out.println(buf.length);

        s.getChars(start, 25, buf,1);
        System.out.println(buf);
    }
}

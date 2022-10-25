public class StringOperations {
    public static void main(String[] args) {
        System.out.println("Hello "+" world");
        System.out.println("Hello ".concat(" world"));
        String s = new String();

        for (int i = 0; i<args.length;i++){
            System.out.println(s + args[i] + " ");
        }


    }
}

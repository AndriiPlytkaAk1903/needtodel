public class SortString {
    static String masuv_rjadkiv[] = {"Андрій","Максим","Руслан","Анатолій","Роман","Віталій"};

public static void main(String[] args) {
        for (int j = 0; j < masuv_rjadkiv.length; j++) {
        for (int i = j + 1; i < masuv_rjadkiv.length; i++) {
        if (masuv_rjadkiv[i].compareToIgnoreCase(masuv_rjadkiv[j]) < 0) {

        String new_masuv = masuv_rjadkiv[j];
        masuv_rjadkiv[j] = masuv_rjadkiv[i];
        masuv_rjadkiv[i] = new_masuv;
        }
        }
        System.out.println(masuv_rjadkiv[j]);
        }
        }
}

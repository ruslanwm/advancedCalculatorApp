import java.util.Scanner;

public class InputUtil {
    public static double daxilEt(String mesaj) {
        System.out.println(mesaj);
        return new Scanner(System.in).nextDouble();
    }

    public static char emeliyyat(String mesaj) {
        System.out.println(mesaj);
        return new Scanner(System.in).nextLine().charAt(0);
    }
}

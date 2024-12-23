import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a = InputUtil.daxilEt("1ci ededi daxil edin:");

        double b = InputUtil.daxilEt("2ci ededi daxil edin:");

        char op = InputUtil.emeliyyat("emeliyyati daxil edin:");

        double result = MathUtil.hesabla(a,b,op);

        System.out.println("netice:"+result);
    }

}
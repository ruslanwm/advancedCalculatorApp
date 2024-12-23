import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a = daxilEt("1ci ededi daxil edin:");

        double b = daxilEt("2ci ededi daxil edin:");

        char op = emeliyyat("emeliyyati daxil edin:");

        double result = hesabla(a,b,op);

        System.out.println("netice:"+result);
    }


    public static double daxilEt(String mesaj) {
        System.out.println(mesaj);
        return new Scanner(System.in).nextDouble();
    }

    public static char emeliyyat(String mesaj) {
        System.out.println(mesaj);
        return new Scanner(System.in).nextLine().charAt(0);
    }

   public static double hesabla(double a, double b, char op) {
       double result=0;

       switch (op) {
           case '+': result=a+b;
               break;
           case '-': result=a-b;
               break;
           case '*': result=a*b;
               break;
           case '/': result=a/b;
               break;
       }
        return result;
   }

}
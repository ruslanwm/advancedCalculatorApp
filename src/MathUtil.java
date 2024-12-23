public class MathUtil {
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

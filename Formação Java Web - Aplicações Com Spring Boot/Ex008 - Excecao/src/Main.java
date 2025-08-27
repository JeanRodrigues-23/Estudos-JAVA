public class Main {
    public static void main(String[] args) {
        try {
            Divisor divisor = (n1, n2) ->  {
                if (n2 == 0) {
                    throw new ArithmeticException("Divisão por zero");
                }
                return n1 / n2;
            };
            double n1 = 5.4;
            double n2 = 0;
            System.out.println(divisor.divide(n1, n2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

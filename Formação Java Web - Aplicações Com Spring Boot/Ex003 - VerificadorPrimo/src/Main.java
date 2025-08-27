public class Main {
    public static void main(String[] args) {
        VerificadorPrimo verificador = (a) -> {
            if (a == 1) {
                return false;
            } else {
                for (int i = 2; i <= Math.sqrt(a); i++) {
                    if (a % i == 0) return false;
                }
            }
            return true;
        };
        System.out.println((verificador.verificadorPrimo(10)));
    }
}

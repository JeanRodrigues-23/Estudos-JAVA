public class Carro {

    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double ano1, double ano2, double ano3) {
        this.precoAno1 = ano1;
        this.precoAno2 = ano2;
        this.precoAno3 = ano3;
    }

    public void menorMaiorPreco() {
        double maior = 0;
        double menor = 0;
        if (precoAno1 > precoAno2 && precoAno1 > precoAno3) {
            maior = precoAno1;
        } else if (precoAno2 > precoAno3) {
            maior = precoAno2;
        } else {
            maior = precoAno3;
        }

        if (precoAno1 < precoAno2 && precoAno1 < precoAno3) {
            menor = precoAno1;
        } else if (precoAno2 < precoAno3) {
            menor = precoAno2;
        } else {
            menor = precoAno3;
        }

        System.out.println(String.format("O maior preco atingido foi R$ %.2f e o maior foi R$ %.2f", maior, menor));
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }
}

public class Celular {
    private int nivelBateria;

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria < 0 || nivelBateria > 100) {
            System.out.println("Nível de bateria não permitido");
        } else {
            this.nivelBateria = nivelBateria;
            if (nivelBateria <= 20) {
                System.out.println("Status: bateria fraca.");
            } else if (nivelBateria > 20 && nivelBateria < 80) {
                System.out.println("Status: bateria OK.");
            } else {
                System.out.println("Status: bateria cheia.");
            }
        }
    }

}

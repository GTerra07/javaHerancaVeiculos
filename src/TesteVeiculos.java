public class TesteVeiculos {
    public static void main(String[] args) {
        Automovel automovel1 = new Automovel();
        automovel1.setMarca("Ford");
        automovel1.setModelo("Fiesta");
        automovel1.setAnoFabricacao(2018);
        automovel1.setNumPortas(4);
        System.out.println("Automóvel: " + automovel1.getMarca() + " " + automovel1.getModelo() + ", " + automovel1.getAnoFabricacao() + ", " + automovel1.getNumPortas() + " portas.");

        Motocicleta motocicleta1 = new Motocicleta();
        motocicleta1.setMarca("Honda");
        motocicleta1.setModelo("CB 500");
        motocicleta1.setAnoFabricacao(2020);
        motocicleta1.setCilindradas(500);
        System.out.println("Motocicleta: " + motocicleta1.getMarca() + " " + motocicleta1.getModelo() + ", " + motocicleta1.getAnoFabricacao() + ", " + motocicleta1.getCilindradas() + " cc.");
    }
}

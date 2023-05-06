public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setCor("Amarelo");
        carro.setPlaca("MDR995");
        carro.setTipo("Fiat");
        carro.setNumPortas(4);

        System.out.println(carro.getCor());
        System.out.println(carro.getPlaca());
        System.out.println(carro.getTipo());
        System.out.println(carro.getNumPortas());
    }
}
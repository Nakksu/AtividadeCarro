public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setCombustivel(20);
        carro.setMarca("Fiat");
        carro.setPeso(900);
        carro.setAnoFabricacao(2015);
        carro.setCor("Azul");
        carro.setPlaca("MDR995");
        carro.setTipo("Esportivo");
        carro.setNumPortas(4);

        System.out.println("A cor do carro é: " +carro.getCor());
        System.out.println("A placa do carro é: " +carro.getPlaca());
        System.out.println("O carro é do tipo: " +carro.getTipo());
        System.out.println("Numero de portas: " +carro.getNumPortas());
        System.out.println("O carro possúi de combustível: "+carro.getCombustivel());
        System.out.println("A marca do carro é: " +carro.getMarca());
        System.out.println("O carro pesa: " +carro.getPeso()+"kg");
        System.out.println("O carro foi fabricado em: " +carro.getAnoFabricacao());
    }
}

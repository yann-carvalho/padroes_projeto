public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Carro e Moto
        Carro carro1 = new Carro("Toyota", 2020, 4, "Automática");
        Carro carro2 = new Carro("Honda", 2018, 4, "Manual");

        Moto moto1 = new Moto("Yamaha", 2019, 250, "Elétrica");
        Moto moto2 = new Moto("Suzuki", 2021, 600, "Kick");

        // Definindo se os carros estão aptos para rodar em áreas restritas
        carro1.setAptoParaRodarEmAreasRestritas(true);
        carro2.setAptoParaRodarEmAreasRestritas(false);

        // Exibindo detalhes dos carros
        System.out.println("Detalhes do carro 1:");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Ano de Fabricação: " + carro1.getAnoFabricacao());
        System.out.println("Número de Rodas: " + carro1.getNumeroRodas());
        System.out.println("Tipo de Transmissão: " + carro1.getTipoTransmissao());
        System.out.println("Apto para rodar em áreas restritas? " + (carro1.isAptoParaRodarEmAreasRestritas() ? "Sim" : "Não"));

        System.out.println("\nDetalhes do carro 2:");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Ano de Fabricação: " + carro2.getAnoFabricacao());
        System.out.println("Número de Rodas: " + carro2.getNumeroRodas());
        System.out.println("Tipo de Transmissão: " + carro2.getTipoTransmissao());
        System.out.println("Apto para rodar em áreas restritas? " + (carro2.isAptoParaRodarEmAreasRestritas() ? "Sim" : "Não"));

        // Exibindo detalhes das motos
        System.out.println("\nDetalhes da moto 1:");
        System.out.println("Marca: " + moto1.getMarca());
        System.out.println("Ano de Fabricação: " + moto1.getAnoFabricacao());
        System.out.println("Cilindrada: " + moto1.getCilindrada());
        System.out.println("Tipo de Partida: " + moto1.getTipoPartida());

        System.out.println("\nDetalhes da moto 2:");
        System.out.println("Marca: " + moto2.getMarca());
        System.out.println("Ano de Fabricação: " + moto2.getAnoFabricacao());
        System.out.println("Cilindrada: " + moto2.getCilindrada());
        System.out.println("Tipo de Partida: " + moto2.getTipoPartida());
    }
}
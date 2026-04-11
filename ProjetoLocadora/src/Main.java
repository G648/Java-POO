import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Criando veículos
        Carro carro1 = new Carro("Toyota", "Corolla", 2023, 150.0, 4);
        Carro carro2 = new Carro("Fiat", "Uno", 2020, 80.0, 2);
        Moto moto1  = new Moto("Honda", "CB 500", 2022, 100.0, 500);
        Moto moto2  = new Moto("Yamaha", "Factor", 2021, 60.0, 150);

        // Testando encapsulamento — valor negativo é barrado
//        System.out.println(">> Tentando setar preço negativo no Corolla:");
//        carro1.setPrecoBase(-50);
//        System.out.println("   Preço continua: R$ " + carro1.getPrecoBase());
//        System.out.println();

        // Montando a frota da locadora (polimorfismo)
        Locadora locadora = new Locadora();
        locadora.adicionarVeiculo(carro1);
        locadora.adicionarVeiculo(carro2);
        locadora.adicionarVeiculo(moto1);
        locadora.adicionarVeiculo(moto2);
        locadora.adicionarVeiculo(carro1);
        locadora.listarFrota();

        System.out.print("Escolha o veículo (1 a " + locadora.tamanhoFrota() + "): ");
        int escolha = sc.nextInt();

        System.out.print("Quantos dias vai ficar com o veículo? ");
        int dias = sc.nextInt();

        locadora.alugar(escolha, dias);
    }
}

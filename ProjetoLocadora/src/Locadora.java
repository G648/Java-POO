import java.util.ArrayList;
import java.util.List;

class Locadora {
    private List<Veiculo> frota;

    public Locadora() {
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo v) {
        frota.add(v);
    }

    public void listarFrota() {
        System.out.println("\n========== FROTA DISPONÍVEL ==========");
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);
            System.out.printf("  [%d] %-30s | Diária: R$ %.2f%n", (i + 1), v, v.calcularDiaria());
        }
        System.out.println("======================================\n");
    }

    public Veiculo getVeiculo(int indice) {
        return frota.get(indice);
    }

    public int tamanhoFrota() {
        return frota.size();
    }

    public void alugar(int escolhaVeiculo, int dias) {

        Veiculo v = frota.get(escolhaVeiculo - 1);
        double total = v.calcularDiaria() * dias;

        System.out.println("\n-------- RESUMO DO ALUGUEL --------");
        System.out.println("Veículo: " + v);
        System.out.printf("Diária:  R$ %.2f%n", v.calcularDiaria());
        System.out.println("Dias:    " + dias);
        System.out.printf("TOTAL:   R$ %.2f%n", total);
        System.out.println("-----------------------------------");
    }

}
public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, double precoBase, int cilindrada) {
        super(marca, modelo, ano, precoBase);
        this.cilindrada = cilindrada;
    }

    // Moto acima de 300cc tem acréscimo de 15%
    @Override
    public double calcularDiaria() {
        if (cilindrada > 300) {
            return getPrecoBase() * 1.15;
        }
        return getPrecoBase();
    }
}

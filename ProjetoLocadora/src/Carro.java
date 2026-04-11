// PILAR 3 - HERANÇA
// Carro e Moto herdam tudo de Veiculo, mas cada um adiciona
// seus próprios atributos e implementa calcularDiaria() do seu jeito.
public class Carro extends Veiculo{
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, double precoBase, int quantidadePortas) {
        super(marca, modelo, ano, precoBase);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public double calcularDiaria() {
        //carro com 4 portas terá acrescimo de 20%
        if (quantidadePortas >= 4){
            return getPrecoBase() * 1.20;
        }
        return getPrecoBase();
    }
}

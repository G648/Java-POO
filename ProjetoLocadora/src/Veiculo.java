// SISTEMA DE VEÍCULOS - 4 pilares da POO em Java
// Uma locadora de veículos precisa calcular o valor da diária
// de diferentes tipos de veículos (Carro e Moto).
// Cada tipo tem seu próprio cálculo.


//PILAR 1 - ABSTRAÇÃO
//MODELAR APENAS O QUE IMPORTA: marca, modelo, ano, placa, preço base.
//MÉTODO calcularDiaria()
// abstrato pois cada veículo terá sua prória diária (calculo)
abstract class Veiculo {

    //Atributos protegidos -> Encapsulamentos
    private String marca;
    private final String modelo;
    private int ano;
    private double precoBase;

    //Construtor da classe
    public Veiculo(String marca, String modelo, int ano, double precoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoBase = precoBase;
    }

    /// método abstrato - CADA SUBTIPO DEFINE O CALCULO
    public abstract double calcularDiaria();

    //PILAR 2 - ENCAPSULAMENTO
    // MODIFICADORES VIA GETTERS E SETTERS
    //O SETTER DE PRECOBASE TEM VALIDAÇÃO: NÃO ACEITA VALORES NEGATIVOS

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca () {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase){
        if(precoBase < 0){
            System.out.println("Erro: preço não pode ser negativo");
            return;
        }

        this.precoBase = precoBase;
    }

    public String toString() {
        return marca + " " + modelo + " (" + ano + ")";
    }
}
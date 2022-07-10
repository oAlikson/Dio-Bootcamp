

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    // Construtor
    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public Carro() {
    }

    // getters e setters
    public String getCor() {
        return cor;
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    // Método
    Double totalValor(Double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}

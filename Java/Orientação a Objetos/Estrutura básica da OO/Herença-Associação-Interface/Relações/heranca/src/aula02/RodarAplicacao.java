package aula02;

public class RodarAplicacao {
    public static void main(String[] args) {
        // cirar classe simples
        Funcionario funcionario = new Funcionario();

        //Upcast
        Funcionario Gerente = new Gerente();
        Funcionario Vendedor = new Vendedor();
        Funcionario Faxineiro = new Faxineiro();

        //Downcast  não é recomendado usar em java
        Vendedor vendedor2 = (Vendedor) new Funcionario();

    }
    
}
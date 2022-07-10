package banco.digital;

public class Main 
{
    public static void main( String[] args ) {
        Cliente alikson = new Cliente();
        alikson.setNome("Alikson");
        alikson.setCpf("000.000.000-01");
        alikson.setEmail("alikson@gmail.com");
        alikson.setIdade(31);

        Conta cc = new ContaCorrente(alikson);
        cc.depositar(200);
        cc.sacar(35);
        
        Conta cp = new ContaPoupanca(alikson);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println("=====================================");

        Cliente emilly = new Cliente();
        emilly.setNome("Emilly");
        emilly.setCpf("000.000.000-02");
        emilly.setEmail("emilly@gmail.com");
        emilly.setIdade(6);

        IConta cc2 = new ContaCorrente(emilly);
        cc.depositar(500);
        cc.sacar(198);
        
        IConta cp2 = new ContaPoupanca(emilly);
        cc.transferir(201, cp);

        cc2.imprimirExtrato();
        cp2.imprimirExtrato();


    }
}

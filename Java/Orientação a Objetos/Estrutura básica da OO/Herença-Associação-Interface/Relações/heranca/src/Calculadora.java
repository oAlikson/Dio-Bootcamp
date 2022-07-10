
public class Calculadora implements OperacaoMatematica {

    @Override
    public void soma(Double operando1, double operando2) {
        System.out.println("Soma: " + (operando1 + operando2));
        
    }

    @Override
    public void subtracao(Double operando1, double operando2) {
        System.out.println("Subtração: " + (operando1 - operando2));
        
    }

    @Override
    public void multiplicacao(Double operando1, double operando2) {
        System.out.println("Multiplicação: " + (operando1 * operando2));
        
    }

    @Override
    public void divisao(Double operando1, double operando2) {
        System.out.println("Divisão: " + (operando1 / operando2));
        
    }
    
}
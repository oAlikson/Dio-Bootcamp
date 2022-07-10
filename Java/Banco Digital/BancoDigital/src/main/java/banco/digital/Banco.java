package banco.digital;

import java.util.List;

import lombok.Data;

@Data

public class Banco {
    public String nome;
    private List<Conta> contas;
}
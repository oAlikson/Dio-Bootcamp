package banco.digital;

import lombok.Data;

@Data

public class Cliente {
    private String nome;    
    private String cpf;    
    private Integer idade;    
    private String email;
    private String endereco; 
}
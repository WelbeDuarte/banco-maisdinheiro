import java.math.BigDecimal;

public class Conta {
    
    String numeroConta;
    String numeroAgencia;
    BigDecimal saldo;
    BigDecimal limite; 

    public void depositar(BigDecimal saldo){
        this.saldo=this.saldo.add(saldo); 
    }   
    
    public void sacar(BigDecimal saldo){
        this.saldo=this.saldo.subtract(saldo);
    }
    
}

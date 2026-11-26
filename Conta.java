import java.math.BigDecimal;

public class Conta {
    
    String numeroConta;
    String numeroAgencia;
    BigDecimal saldo;

    public void depositar(BigDecimal saldo){
        this.saldo=this.saldo.add(saldo);
    }

}

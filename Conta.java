package Maven;

public class Conta {

    private Integer agencia;
    private Integer numeroDaConta;
    private Double saldoConta;
    private Enum<?> tipoDeConta;
    private TitularPessoa titular;
    private Banco banco;

    public Conta(Integer agencia, Integer numeroDaConta, Double saldoConta, Enum<?> tipoDeConta, 
    		TitularPessoa titular, Banco banco) {
        
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.saldoConta = saldoConta;
        this.tipoDeConta = tipoDeConta;
        this.titular = titular;
        this.banco = banco;

    }

    @Override
    public String toString() {
        return 	  "\n" + titular
                + "\nTipo de conta: " + tipoDeConta
                + "\nAgencia: " + agencia
                + "\nNumero da conta: " + numeroDaConta
                + "\nSaldo da conta: " + saldoConta
                + "Banco: " + banco + "\n";
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public Enum<?> getTipoDeConta() {
        return tipoDeConta;
    }

    public TitularPessoa getTitular() {
        return titular;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void setTipoDeConta(Enum<?> tipoDeConta) {
        this.tipoDeConta = tipoDeConta;

    }

    public void setTitular(TitularPessoa titular) {
        this.titular = titular;
    }
    public Banco getBanco() {
    	return banco;
    }
    public void setBanco(Banco banco) {
    	this.banco = banco;
    }

	public static Object stream() {
		return null;
	}
}
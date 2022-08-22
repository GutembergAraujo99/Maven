package Maven;

public class Banco {

	private String nomeBanco;
	private Integer codigoBanco;
	
    public Banco(String nomeBanco, Integer codigoBanco) {
        super();
        this.nomeBanco = nomeBanco;
        this.codigoBanco = codigoBanco;

    }

    @Override
    public String toString() {
        return  
        		 "\nNome do Banco: " + nomeBanco
                + "\nCodigo do Banco: " + codigoBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public Integer getcodigoBanco() {
        return codigoBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public void setCodigoBanco(Integer codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

}
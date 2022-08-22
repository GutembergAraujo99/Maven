package Maven;

public class Main {
	
    public static void main(String[] args) {

        GerenciadorDeConta GerenciadorDeContas = new GerenciadorDeConta();

        TitularPessoa titular1 = new TitularPessoa("Gutemberg", "385930808212");
        TitularPessoa titular2 = new TitularPessoa("Henrique", "845658902354");
        TitularPessoa titular3 = new TitularPessoa("Emerson Basílio", "604935657785");

        Banco banco1 = new Banco("INTER", 077);
        Banco banco2 = new Banco("NEXT", 316);
        Banco banco3 = new Banco("ITAU", 721);
        Banco banco4 = new Banco("NUBANK", 064);
        Banco banco5 = new Banco("CAIXA", 252);
        
        
        GerenciadorDeContas.adicionaContas(582, 8719, 294.00, TipoDeConta.CORRENTE, titular1, banco1);
        GerenciadorDeConta gerenciadorDeConta2 = new GerenciadorDeConta();
		gerenciadorDeConta2.adicionaContas(582, 9124, 5694.00, TipoDeConta.POUPANCA, titular1, banco1);

        gerenciadorDeConta2.adicionaContas(316, 2716, 6791.00, TipoDeConta.SALARIO, titular2, banco2);
        
        gerenciadorDeConta2.adicionaContas(291, 8604, 4455.00, TipoDeConta.SALARIO, titular3, banco3);
        GerenciadorDeContas.adicionaContas(975, 3289, 12.00, TipoDeConta.CORRENTE, titular3, banco4);
        GerenciadorDeContas.adicionaContas(322, 2356, 234.00, TipoDeConta.SALARIO, titular3, banco5);

       try {
		GerenciadorDeConta gerenciadorDeConta = new GerenciadorDeConta();
		gerenciadorDeConta.buscaContaPorCpf("23257845323213");
	} catch (ContaNaoEncontrada e) {
		e.printStackTrace();
	}
       
        try {
			System.out.println(GerenciadorDeConta.consultaConta("In", 645, 7554).get());
		} catch (ContaNaoEncontrada e) {
			e.printStackTrace();
		}
       
    }
}
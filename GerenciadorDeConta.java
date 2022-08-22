package Maven;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GerenciadorDeConta {

	static List<Conta> listagemDeConta = new ArrayList<>();

	public void adicionaContas(Integer agencia, Integer numeroDaConta, Double saldoConta, @SuppressWarnings("rawtypes") Enum tipoDeConta,
			TitularPessoa titular, Banco banco) {

		Conta conta = new Conta(agencia, numeroDaConta, saldoConta, tipoDeConta, titular, banco);

		listagemDeConta.add(conta);
	}

	public String buscaContaPorCpf(String cpf) throws ContaNaoEncontrada{
		List<Conta> contasComCpf = listagemDeConta.stream().filter(conta -> conta.getTitular().getCpf().equals(cpf))
				.collect(Collectors.toList());
		if (contasComCpf.isEmpty()) {
			throw new ContaNaoEncontrada("A conta não foi encontrada.");
		} else {
			System.out.println(contasComCpf);
		}
		return cpf;
	}


	public static Optional<Conta> consultaConta(String nomeBanco, Integer agencia, 
			Integer numeroDaConta) throws ContaNaoEncontrada{
	return Optional.of(listagemDeConta
				.stream().filter(conta -> conta.getBanco().getNomeBanco().equals(nomeBanco))
			.filter(conta -> conta.getAgencia().equals(agencia))
			.filter(conta -> conta.getNumeroDaConta().equals(numeroDaConta)).findFirst()
			.orElseThrow(() -> new ContaNaoEncontrada("A conta não foi encontrada.")));
		}
}
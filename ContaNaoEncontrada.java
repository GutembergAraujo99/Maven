package Maven;

public class ContaNaoEncontrada extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ContaNaoEncontrada(String message) {
		super(message);
	}
}
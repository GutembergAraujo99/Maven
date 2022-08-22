package Maven;

public class SaldoInsuficiente extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SaldoInsuficiente(String message) {
		super(message);
	}
}
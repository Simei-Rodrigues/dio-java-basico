package celular;

public class Celular implements Ligar {
	
	public void fazerLigacao() {
		System.out.println("FAZENDO LIGAÇÃO");
	}
	
	public void receberLigação() {
		System.out.println("RECEBENDO LIGAÇÃO");
	}
	
	public void salvarHistoricoDeLigacao() {
		System.out.println("SALVANDO HITÓRICO DE LIGAÇÃO");
	}
	
	public void iniciarCorreioDeVoz() {
		System.out.println("INCIANDO CORREIRO DE VOZ");
	}
}

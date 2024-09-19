public abstract class Conta implements Iconta {  //classe abstrata não permite que seja estanciadas, ou seja, serão estanciadas pela classes filhas

	private static final int AGENCIA_PADRAO = 1; // gera o número da agencia 
	private static int SEQUENCIAL = 1;             //geração de número sequincial para numero
	
	protected int agencia;   // atributos encapsulados como protected, assim ele podem ser alterados pela classe filha
	protected int numero;     
	protected double saldo;
	protected Cliente cliente;
	protected Banco banco;
	
    public Conta(Cliente cliente, Banco banco) {            //metodo constutor de numero,
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero  = SEQUENCIAL++;
		this.cliente = cliente;
		this.banco   = banco;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta numeroDestino) {
		this.sacar(valor);
		numeroDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Banco  : %s", this.banco.getNome() ));
		System.out.println(String.format("Titular: %s", this.cliente.getNome() ));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("numero : %d", this.numero));
		System.out.println(String.format("Saldo  : %.2f", this.saldo));
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente
				+ ", banco=" + banco + "]";
	}
}


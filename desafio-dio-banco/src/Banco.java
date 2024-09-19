import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contaList;

	public Banco() {
    	
    	this.contaList = new ArrayList<>(); 
    }
    
    public void addConta(Conta conta) { 
		contaList.add(conta);
    }
 
    public void mostraContas() {
        for (Conta conta: contaList) {
        	System.out.println("Banco: " + conta.banco.getNome() + " - Agencia: " + conta.getAgencia() + " - Conta : " + conta.getNumero());
        }	
    }
    
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}

    public List<Conta> getContaList() {
		return contaList;
	}

	public void setContaList(List<Conta> contaList) {
		this.contaList = contaList;
	}

	@Override
	public String toString() {
		return "Banco [nome=" + nome + ", bancoList=" + contaList + "]";
	}
}

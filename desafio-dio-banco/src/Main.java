
public class Main {
	
	public static void main(String[] args) {
		
    Cliente simei = new Cliente();
    simei.setNome("Simei");
    Banco aaa = new Banco();
    aaa.setNome("AaaBank");
    
    Conta cc = new ContaCorrente(simei, aaa);
    Conta cp = new ContaPoupanca(simei, aaa);
    
	cc.depositar(100);
	cc.transferir(60, cp);
	
    cc.imprimirExtrato();	
	cp.imprimirExtrato();
	
	Cliente adiel = new Cliente();
    adiel.setNome("Adiel");
    Banco aaa1 = new Banco();
    aaa1.setNome("AaaBank");
    
    Conta cc1 = new ContaCorrente(adiel, aaa1);
    Conta cp1 = new ContaPoupanca(adiel, aaa1);
    
	cc1.depositar(200);
	cc1.transferir(80, cp1);
	
	cc1.imprimirExtrato();	
	cp1.imprimirExtrato();
	
	Banco banco = new Banco();
	banco.addConta(cc);
	banco.addConta(cp);
	banco.addConta(cc1);
	banco.addConta(cp1);
	banco.mostraContas();
	}	
}

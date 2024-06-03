import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//PROGRAMA QUE ATRAVÉS DE UM VETOR COM NOMES DE CANDIDADOS PARA UMA VAGA BASEADA NO SALARIO PRETENDIDO
//SERÃO SELECIONADOS OS CANDIDADOS QUE ESCOLHERAM SALARIO IGUAL OU MENOR QUE O SALARIO BASE, OS SALARIOS SERÃO SIMULAODS POR UM MÉTODO RONDÓMICO
//exercicio do bootcamp DIO controle de fluxo do case1 ao case4

public class ProcessoSeletivo {
	
	static String[] candidatos = {"FELIPE","MARCIA","LUCIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
	static String concatenaCanditadoSelecionado = "";
	static Double salarioBase=2000.00;
	
	
	public static void main(String[] args) 
	{
	  selecaoCandidatos();
	  imprimirCandidatosSelecionados();
	  ligarParaSelecionados();
	}
	
	static void selecaoCandidatos() 
	{   
		int candidatosSelecionados = 0;
		int candidatoAtual=0;
		//String concatenaCanditadoSelecionado = "";
	    while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length )
	    {
	    	String candidato = candidatos[candidatoAtual];
	    	double salarioPretendido = valorPretendido();
	    	
	    	System.out.println(candidatoAtual + " - O candidato " +candidato+ " solicitou o salário no valor R$ " + salarioPretendido);
	    	if (salarioBase >= salarioPretendido)
	    	{
	    		System.out.println("CANDIDATO SELECIONADO PARA VAGA");
	    		concatenaCanditadoSelecionado = concatenaCanditadoSelecionado + candidatoAtual; // AQUI ESTA CRIANDO UMA FILA NA STRING concatenaCanditadoSelecionado CONCATENANDO O INDICE QUE É A VARIÁVEL candidatoAtual.
	    		candidatosSelecionados ++;
	    	}
	    	
	    	analisarCandidato(salarioPretendido);
	    	
	    	candidatoAtual++;
	    } 	
	}
	
	//METODO PARA GERAR UM VALOR ENTRE 1800 E 2200 PARA SER USASDO COMO salarioPretendido PELO CANDIDATO
	static double valorPretendido() 
	{
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analisarCandidato(double salarioPretendido) 
	{
		if (salarioBase > salarioPretendido) 
		{
			System.out.println("LIGAR PARA CANDIDATO");
		}
		else
		{
			if (salarioBase == salarioPretendido) 
			{
				System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
			}
			else
			{
				System.out.println("AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS");
			}
		}
	}
	
	
	//METODO PARA IMPRIMIR A LISTA  COM OS NOMES DOS SELECIONADOS, USANDO UMA STRING concatenaCanditadoSelecionado COMO UMA FILA  
	static void imprimirCandidatosSelecionados() 
	{
		System.out.println("\nLISTA DE CANDIDATOS SELECIONADOS:");
		char indiceCandidatoSelecionado;
		for (int i=0; i<concatenaCanditadoSelecionado.length();i++) {
			indiceCandidatoSelecionado = concatenaCanditadoSelecionado.charAt(i); // CONTANDO A QUANTIDADE DE i DENTRO DA STRING
			
			int variavelProcuradaInt = Character.getNumericValue(indiceCandidatoSelecionado);
			
			System.out.println(candidatos[variavelProcuradaInt]);	
   	}
  }	
	
	//TEREMOS A BAIXO OS 3 METODOS QUE REALIZA A CHAMANDA PARA OS CANDIDATOS SELECIONADOS
	static void ligarParaSelecionados() {
		char indiceCandidatoSelecionado;
		for (int i=0; i<concatenaCanditadoSelecionado.length();i++) {
		     indiceCandidatoSelecionado = concatenaCanditadoSelecionado.charAt(i); // CONTANDO A QUANTIDADE DE i DENTRO DA STRING
			
			int variavelProcuradaInt = Character.getNumericValue(indiceCandidatoSelecionado);
			
			System.out.println("Entrando em contato com o candidato " + candidatos[variavelProcuradaInt]);
			
			entrandoEmContato(candidatos[variavelProcuradaInt]);
   	     }
		
}
	static void entrandoEmContato(String candidato) 
	{
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("TENTATIVA REALIZADA COM SUCESSO");
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("Conseguimos contato com " + candidato + " na tentativa " + tentativasRealizadas);
		else
			System.out.println("Não conseguimos contatos com " + candidato + " com " + tentativasRealizadas + " tentativas");
	}
	//METODO AUXILIAR RONDOMICO PARA SIMULAR O RECEBIMENTO DE LIGAÇÕES ATENDIDAS
	static boolean atender() 
	{  
		return new Random().nextInt(3)==1;
	}
}
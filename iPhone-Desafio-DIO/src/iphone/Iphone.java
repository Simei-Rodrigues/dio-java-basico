package iphone;
import celular.Ligar;
import computador.Internet;
import ipod.Musica;
import ipod.Video;

public class Iphone implements Ligar, Internet, Musica, Video {
	
	//METODOS DE LIGAÇÃO PARA FUNÇÃO DE CELULAR
	
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
	
	//METODOS DE INTENET PARA FUNÇÃO DO COMPUTADOR
	
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA DA INTERNET");
	}
	
	public void novaAba() {
		System.out.println("ADICIONANDO NOVA ABA A PAGINA");
	}
		
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA");
	}	

    //IMPLEMENTAR FUNCIONALIDADES DE MUSICA
		
	public void ListarMusicas() {
		System.out.println("EXIBINDO LISTA DA MUSICAS");
	}
	
	public void tocarMusica(){
		System.out.println("TOCANDO MUSICA");
	}
	
	public void pausarMusica() {
		 System.out.println("PAUSANDO MUSICA");
	}
	
	public void avançarMusica() {
		System.out.println("AVANÇANDO TEMPO DA MUSICA");
	}
	
	public void retrocederMusica() {
		System.out.println("RETROAGINDO TEMPO DA MUSICA MUSICA");
	}
	
	public void proximaMusica() {
		System.out.println("PASSANDO PARA PROXIMA MUSICA");
	}
	
	public void MusicaAnterior() {
		System.out.println("VOLTANDO PARA MUSICA ANTERIOR");
	}
	
	//IMPLEMENTAR FUNCIONALIDADES DE VIDEO
	
	public void listarVideos() {
		System.out.println("EXIBINDO LISTA DE VIDEOS");
	}
	
	public void exibirVideo() {
		System.out.println("PASSANDO VIDEO");
	}
	
	public void pausarVideo() {
		System.out.println("PAUSARNDO VIDEO");
	}
	
	public void avancarVideo() {
		System.out.println("AVANÇANDO TEMPO DO VIDEO");
	}
	
	public void retrodederVideo() {
		System.out.println("RETROAGINDO TEMPO DO VÍDEO");
	}
	
	public void proximoVideo() {
		System.out.println("PASSANDO PARA O PROXIMO VIDEO");
	}
	
	public void videoAnterio() {
		System.out.println("VOLTANDO PARA O VIDEO ANTERIO");
	}		
		

}

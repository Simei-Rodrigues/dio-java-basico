package ipod;

public class Ipod implements Musica, Video {
	
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

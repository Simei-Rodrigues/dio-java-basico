import celular.Celular;
import computador.Computador;
import iphone.Iphone;
import ipod.Ipod;

public class Estabelcimento {

	public static void main(String[] args) {
		
        Iphone iphone = new Iphone();
		iphone.fazerLigacao();
		iphone.receberLigação();
		iphone.exibirPagina();
		iphone.atualizarPagina();
		iphone.tocarMusica();
		iphone.avançarMusica();
		iphone.exibirVideo();
		iphone.pausarVideo();
    }
}

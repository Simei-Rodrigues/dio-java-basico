public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarttv = new SmartTv();


        smarttv.diminuirVolume();  //DIMINUIO VOLUME EM 1 
        smarttv.diminuirVolume();  //DIMINUIO VOLUME EM 1
        smarttv.diminuirVolume();  //DIMINUIO VOLUME EM 1
        smarttv.aumentarVolume();  //AUMENTA O VOLUME EM 1
        System.out.println("Volume atual --> " + smarttv.volume);

        System.out.println("Tv ligada? " + smarttv.ligada);
        System.out.println("Canal atual: " + smarttv.canal);
        System.out.println("Volume atual: " + smarttv.volume);

        System.out.println("Canal Atual --> " + smarttv.canal);
        smarttv.mudarCanal(13); // muda canal para 13
        System.out.println("Canal mudado --> " + smarttv.canal);

        smarttv.ligar();
        System.out.println("Novo status --> TV ligada?  " + smarttv.ligada);

        smarttv.desligar();
        System.out.println("Novo status --> TV ligada? " + smarttv.ligada );

    }
}

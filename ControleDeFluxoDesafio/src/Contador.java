import java.util.Scanner;

public class Contador{

    public static void main(String[] args){
     
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Digite o primeiro numero inteiro: ");
            int parametro1 = input.nextInt();
            System.out.println("Digite o segundo numero inteiro: ");
            int parametro2 = input.nextInt();
       
            contador(parametro1, parametro2);
        } catch (ParametroInvalidoException e){
           System.out.println("O SEGUNDO PARÂMETRO DEVE SER MAIOR QUE O PRIMEIRO");
        }
     }

    static void contador(int numero1, int numero2) throws ParametroInvalidoException{
    	
        if (numero1 >= numero2)
             throw new ParametroInvalidoException();
        int resultado = numero2 - numero1;
           
        for (int i=1; i <= resultado; i++){
            System.out.print(i+"-");
        }      
    }
}
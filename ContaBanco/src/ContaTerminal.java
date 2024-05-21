import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{

    public static void main (String[] args) throws Exception
    {
             //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
            //Exibir mensagem para o usuário
        System.out.println("Por favor, digite o número da conta: ");
            //obter pelo sscanner o valor digitado no terminal 
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o numero da agencia no formato 999-9: ");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
    
              //Exibir mensagem da conta criada    
        System.out.println("Olá "+nome+", obrigado por cria uma conta em nosso banco, sau agência é "
                           + agencia + ", conta" + numero + " e seu saldo " + saldo + " já está disponível para saque");
     }
}
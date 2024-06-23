public class App 
{
    public static void main(String[] args) throws Exception {
        System.out.println("Fazendo parte da turma DIO");
        planoOperadora();
    }

    public static void planoOperadora()
    {
        String plano = "M"; // B // T

        switch (plano)
        {
            case "T":
            {
                System.out.println("5g YouTube");
            }
            case "M":
            {
                System.out.println("Whats e Instagram gratis");
            }
            case "B":
            {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
 

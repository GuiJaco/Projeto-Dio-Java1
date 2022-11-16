import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da Agência!");
            int numero = scanner.nextInt();
            
            System.out.println("Por favor, digite a Agência!");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o seu nome!");
            String nome = scanner.next();

            double saldo = 100.10;

                
            System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
        }

    }


}

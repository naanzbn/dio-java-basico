import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        System.out.println(numero);
        System.out.println(agencia);
        System.out.println(nomeCliente);
        System.out.println(saldo);

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da Agência!");
        String nome = scanner.next(agencia);
        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + 
        " já está disponível para saque");
    }
}

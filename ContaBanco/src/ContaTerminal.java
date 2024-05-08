
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 1021;
        Float saldo = 237.48F;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Por favor, digite o número da agência: ");
        String ag = entrada.nextLine();

        System.out.println("Olá, " + nome+", obrigado por criar uma conta em nosso banco, sua agencia é " + ag+", conta " + numero + " e seu saldo: " + saldo + " já está disponível para saque.");
        entrada.close();
    }
}

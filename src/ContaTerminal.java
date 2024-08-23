import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero_conta;
        int agencia;
        String nome_cliente;
        Float saldo;

        System.out.println("Por Favor digite o numero da agência!: ");
        agencia = scanner.nextInt();

        System.out.println("Por Favor digite o seu nome: ");
        nome_cliente = scanner.next(); 

        System.out.println("Por Favor digite o numero da sua conta: ");
        numero_conta = scanner.nextInt();
    
        System.out.println("Por Favor digite o saldo da sua conta: ");
        saldo = scanner.nextFloat();

        
        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero_conta+ " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}

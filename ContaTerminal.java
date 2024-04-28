import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) {

        Scanner leituraTeclado = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = leituraTeclado.next();

        System.out.println("Por favor, digite o número da Conta !");
        int numero = leituraTeclado.nextInt();

        System.out.println("Por favor, digite o número da Nome do Cliente!");
        String nomeCliente = leituraTeclado.next();

        System.out.println("Por favor, digite o Saldo!");
        Double saldo = leituraTeclado.nextDouble();

        System.out.println("Olá" +  nomeCliente + ", obrigado por criar " +
                "uma conta em nosso banco, sua agência é " + agencia+ ", " +
                "conta + " + numero + " e seu saldo "+ saldo +" já está disponível para saque");

    }

}
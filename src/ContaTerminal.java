import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //TODO Importar a classe Scanner
        Scanner scn = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo = 100f;
        //Exibir a Mensagem para o nosso usuario
        System.out.println("Porfavor digite seu numero da agência: ");
        numero = scn.nextInt();
        System.out.println("Porfavor informe sua agência: ");
        agencia = scn.next();
        System.out.println("Informe seu Nome: ");
        nomeCliente = scn.next();
        //Obter os valores do scanner

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é de R$" + saldo + " ja disponivel para saque." );
    }
}

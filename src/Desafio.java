import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        String titular = scanner.next();
        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

class ContaBancariar { //no desafio esta ContaBancaria sem "r" no final
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancariar(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupanca extends ContaBancariar {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo); // TODO: Implementar adequadamente esta sobrecarga de construtores.
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        // TODO: Complementar as informações com a taxa de juros.
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
}
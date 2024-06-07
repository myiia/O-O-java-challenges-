import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

}

public class Desafior {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            // Se for um cofre digital, instancia um cofre digital

            int senha = scanner.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senha);

            // Valida a senha

            int confirmacaoSenha = scanner.nextInt();
            if (cofreDigital.validarSenha(confirmacaoSenha)) {
                System.out.println("Tipo: Cofre Digital");
                System.out.println("Metodo de abertura: Senha");
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Tipo: Cofre Digital");
                System.out.println("Metodo de abertura: Senha");
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            // Se for um cofre físico, instancia um cofre físico
            CofreFisico cofreFisico = new CofreFisico();
            System.out.println("Tipo: Cofre Fisico");
            System.out.println("Metodo de abertura: Chave");


        }
    }
}
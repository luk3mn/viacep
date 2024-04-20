
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set your github ceṕ: ");
        String cep = scanner.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();

        try {
            Endereco endereco = consultaCep.buscaEndereco(cep);
            System.out.println(endereco);

            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.salvaJson(endereco);

        } catch (RuntimeException | IOException e) {
            System.out.println(e.getCause());
            System.out.println("Finalizando a aplicação");
        }
    }
}
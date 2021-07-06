import java.io.File;
import java.util.Scanner;

public class ConsultaECriacaoPasta {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o endereço do arquivo: ");
        String strPasta = sc.nextLine();

        File pasta = new File(strPasta);

        // consultar pastas
        File[] pastas = pasta.listFiles(File::isDirectory);
        System.out.println("PASTAS: ");
        for (File file : pastas) {
            System.out.println(file);
        }

        //consultar arquivos
        File[] files = pasta.listFiles(File::isFile);
        System.out.println("ARQUIVOS");
        for (File file : files) {
            System.out.println(file);
        }

        //Inserir pastas
        boolean sucesso = new File(strPasta + "\\teste").mkdir();
        System.out.println("Diretorio criado com sucesso");

        sc.close();
    }


}

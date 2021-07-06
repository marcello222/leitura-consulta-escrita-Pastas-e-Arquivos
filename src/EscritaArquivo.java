import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;

public class EscritaArquivo {


    public static void main(String[] args) {


        String[] lines = new String[]{"Bom dia", "boa tarde", "boa noite"};

        String path = "C:\\Users\\HP\\Documents\\ALURA\\LIVROS\\SCRUM\\cursonelio.TXT";

        //Append true faz com que a escrita seja recriada e não destroi o que ja foi escrito anteriormente
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

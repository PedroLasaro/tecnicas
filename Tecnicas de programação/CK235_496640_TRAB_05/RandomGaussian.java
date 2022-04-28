package CK235_496640_TRAB_05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Random;

public class RandomGaussian extends Sort {
    public static void main(String... args) {
        RandomGaussian g = new RandomGaussian();
        File Log = g.criarlog(); // arquivo log criado a partir do MEAN e VARIACE
        Log = Sorted(Log); // método da classe sort que organiza os arquivos
        System.out.println(g.lerlog(Log));
    }

    static double MEAN = 100.0f;
    static double VARIANCE = 5.0f;
    public RandomGaussian() {
    }

    private static Random fRandom = new Random(); // número aleatório

    private static double getGaussian() {
        return MEAN + fRandom.nextGaussian() * VARIANCE;
    }

    // método para criar e gravar no arquivo Log
    protected File criarlog() {
        try {
            File arquivoLog = new File("Log.txt");
            Writer w = new FileWriter(arquivoLog);
            for (int idx = 1; idx <= 10; ++idx) // salvando os valores em bytes.
            {
                w.write(getGaussian() + "\n");
            }
            w.close();
            return arquivoLog;
        } catch (IOException e) {
            System.out.println("ocorreu um erro ao escrever");
            e.printStackTrace();
            return null;
        }
    }

    // método para ler o arquivo
    protected String lerlog(File arquivo) {
        try {
            Reader r = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(r);
            StringBuffer sb = new StringBuffer();
            String line;
            // o bufferedReader vai fornecer as linha que serão lidas e depois salvas em sb
            while ((line = br.readLine()) != null) {
                sb.append("Generated : ");
                sb.append(line);
                sb.append("\n");
            }
            r.close();
            // retorna sb em forma de String
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return ("Ocorreu um erro ao ler");
        }
    }
}
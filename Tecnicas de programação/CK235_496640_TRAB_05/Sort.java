package CK235_496640_TRAB_05;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.TreeSet;

public class Sort {
    static TreeSet<Double> conjunto;
    protected static File Sorted(File arquivo) {
        try {
            // leitura
            Reader r = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(r);
            conjunto = new TreeSet<Double>(); // TreeSet de Doubles para guardar os valores
            String line;
            while ((line = br.readLine()) != null) // leitor lendo as linhas e adicionando no conjunto
            {
                Double numero = Double.valueOf(line);
                conjunto.add(numero);
            }
            r.close();
            // gravura
            DataOutputStream data = new DataOutputStream(new FileOutputStream(arquivo));
            for (Double dou : conjunto) {
                data.writeBytes(dou.toString());
                data.writeChars("\n");
            }
            data.close();
            return arquivo;
        } catch (IOException e) {
            System.out.println("ocorreu um erro ao organizar");
            e.fillInStackTrace();
            return arquivo;
        }
    }
}

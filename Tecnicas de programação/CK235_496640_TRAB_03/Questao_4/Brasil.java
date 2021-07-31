package CK235_496640_TRAB_03.Questao_4;

import java.util.HashMap;
import java.util.Map;

public class Brasil {
    Map<String,String> b;

    public Brasil() {
        b = new HashMap<String,String>();
        b.put("AC", "Acre");
        b.put("AL", "Alagoas");
        b.put("AP", "Amapá");
        b.put("AM", "Amazonas");
        b.put("BA", "Bahia");
        b.put("CE", "Ceará");
        b.put("ES", "Espiríto Santo");
        b.put("GO", "Goiás");
        b.put("MA", "Maranhão");
        b.put("MT", "Mato Grosso");
        b.put("MS", "Mato Grosso do Sul");
        b.put("PA", "Pará");
        b.put("PB", "Paraíba");
        b.put("PE", "Pernambuco");
        b.put("PI", "Piauí");
        b.put("RJ", "Rio de Janeiro");
        b.put("RN", "Rio Grande do Norte");
        b.put("RS", "Rio Grande do Sul");
        b.put("RO", "Rondônia");
        b.put("RR", "Roraima");
        b.put("SC", "Santa Catarina");
        b.put("SP", "São Paulo");
        b.put("SE", "Sergipe");
        b.put("TO", "Tocantins");
        b.put("DF", "Distrito Federal");
    }

    public void buscar(String para){
        if (b.containsKey(para)) {
            System.out.println(para + " -> " + b.get(para));
        }else{
            System.out.println("Chave não encontrada");
        }
    }
}

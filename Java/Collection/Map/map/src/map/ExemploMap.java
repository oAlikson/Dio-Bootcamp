package map;

import java.util.*;

/*
Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
modelo = gol - consumo = 14,4km/l
modelo = uno - consumo = 15,6 km/l
modelo = mobi - consumo = 16,1 km/l
modelo = hb20 - consumo = 14,5 km/l
modelo = kwid - consumo = 15,6 km/l
 */

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        // criar um map
        Map<String, Double> carrosPopulares = new HashMap<>() {
            {
                put("Gol", 14.4); // String key e o nome Double value para os valores
                put("Uno", 15.6);
                put("Mobi", 16.1);
                put("HB20", 14.5);
                put("Kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares.toString());
        System.out.println("---------------------------------------------");

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("Gol", 15.2); // é só substituir
        System.out.println(carrosPopulares);
        System.out.println("---------------------------------------------");

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));
        System.out.println("---------------------------------------------"); // usa o contains key para saber se existe
                                                                             // alguma key com esse nome

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("Uno")); // get puxa a key
        System.out.println("---------------------------------------------");

        // System.out.println("Exiba o terceiro modelo adicionado: "); não temos como
        // saber usando esse método

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet(); // key sao os nomes
        System.out.println(modelos);
        System.out.println("---------------------------------------------");

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumo = carrosPopulares.values(); // value os valores passados
        System.out.println(consumo);
        System.out.println("---------------------------------------------");

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values()); // aqui puxamos o carro com valor mais
                                                                                 // alto
        // esse metodo retorna um Set
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
        System.out.println("---------------------------------------------");

        // Mesma lógica só que usando o min
        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entre = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : entre) {
            if (entry.getValue().equals(consumoMenosEficiente))
                modeloMenosEficiente = entry.getKey();
        }
        System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
        System.out.println("---------------------------------------------");

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) { // iterator tem proximo?
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);
        System.out.println("---------------------------------------------");

        // soma dividido pela variavel.size que pega o tamanho da mesma
        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));
        System.out.println("---------------------------------------------");

        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) { // iterator tem proximo?
            if (iterator1.next().equals(15.6))
                iterator1.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println("---------------------------------------------");

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {
            { // usa o linked para fazer isso
                put("Gol", 14.4);
                put("Uno", 15.6);
                put("Mobi", 16.1);
                put("HB20", 14.5);
                put("Kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares1.toString());
        System.out.println("---------------------------------------------");

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());
        System.out.println("---------------------------------------------");

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();
        System.out.println("---------------------------------------------");

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
        System.out.println("---------------------------------------------");
    }

}
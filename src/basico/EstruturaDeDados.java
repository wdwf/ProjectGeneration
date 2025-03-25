package basico;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class EstruturaDeDados {
    public static void main(String[] args) {
        /*
         * # HasMap
         * 
         * HashMap é um conjunto de pares do tipo Chave Valor, que são organizadas a
         * partir do Hashcode (Chave). Quando você adiciona um elemento, ele é
         * adicionado na HashMap e o Hashcode correspondente é gerado automaticamente,
         * através uma função matemática, que determina a posição em que o valor será
         * armazenado na tabela. Por se tratar de um número calculado, a posição do
         * elemento será aleatória.
         * 
         * <key: String, Value: String>
         */

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Adiciona itens
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("England", "London");

        // acesso - tem que ser o mesmo valor da chave (se não for retorna null);
        System.out.println(capitalCities.get("USA"));

        // Remover
        capitalCities.remove("England");

        // Percorre a lista - retorna apenas a chaves / .values() retorna apeans os
        // valores
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // retorna a chave e o valor
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + "value: " + capitalCities.get(i));
        }

        /*
         * # FILAS - Queue
         * Uma Fila é uma estrutura de dados do tipo FIFO:
         * "o primeiro elemento que entra é o primeiro elemento que sai" (first in,
         * first out). A ideia fundamental da fila é que só podemos inserir um novo
         * elemento no final da fila e só podemos retirar um elemento do inicio.
         * 
         * Queue, que é uma lista ordenada de objetos, onde só é possível inserir
         * elementos no final da lista e excluir elementos do início da lista, ou seja,
         * segue o princípio FIFO (First-In-First-Out).
         */

        // Queue<T> fila = new LinkedList<T>()
    }
}

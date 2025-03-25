package basico;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collections {
    public static void main(String[] args) {
        /*
         * Collection Queue
         * Collection Queue, que é uma lista ordenada de objetos, onde só é possível
         * inserir elementos no final da lista e excluir elementos do início da lista,
         * ou seja, segue o princípio FIFO (First-In-First-Out).
         * 
         * A Implementação LinkedList ou Lista Vinculada é uma estrutura de dados
         * linear, na qual os elementos não são armazenados em locais de memória
         * contíguos (sequenciais). Os elementos em uma lista vinculada são vinculados
         * usando ponteiros internamente, que "apontam" para o endereço de Memória do
         * próximo item (SimpleLinkedList - Lista Vinculada simples) ou para o endereço
         * de Memória do próximo item e do item anterior (DoubleLinkedList - Lista
         * Duplamente Vinculada).
         * 
         * Fazendo uma analogia com Blocos de montar, uma LinkedList seria como uma
         * sequência de blocos que possuem conexões (links) com o próximo bloco
         * (encadeada) e com o bloco anterior (duplamente encadeada).
         * 
         * por que usar linkedList?
         * A Classe LinkedList, implementa a estrutura de dados chamada de Lista
         * encadeada ou vinculada. Uma lista vinculada é como uma cadeia de nós, onde
         * cada nó contém 2 informações: dados e um ponteiro (indicador) para o próximo
         * nó da cadeia, que indica o endereço de memória onde o próximo elemento está
         * armazenado. Nesta estrutura também existe um ponteiro (indicador), chamado
         * HEAD (cabeça), que aponta para o primeiro elemento da lista vinculada. Caso a
         * lista esteja vazia, ele simplesmente apontará para um Objeto Null (nulo).
         * 
         * ele tem o tamanho dinamico?
         */
        Queue<Integer> fila = new LinkedList<Integer>();

        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println("Tamanho da fila" + fila.size());
        System.out.println("\nElementos na fila: " + fila);
        System.out.println("Remove o primeiro item da fila: " + fila.remove());
        System.out.println("\nFila atualizada: " + fila);
        System.out.println("\nExibir o Primeiro Elemento da fila: " + fila.peek());
        System.out.println("\nExibir o Tamanho da fila: " + fila.size());
        System.out.println("\nChecar se o Elemento 4 existe na fila? " + fila.contains(4));
        System.out.println("\nExibe e Retira da fila o 1º Elemento (HEAD): " + fila.poll());

        System.out.println("\nExibir todos os Elementos da fila por Iteração");

        Iterator<Integer> iterator = fila.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nLimpar a fila");
        fila.clear();

        System.out.println("\nA fila está vazia? " + fila.isEmpty());

        // ------------------

        /*
         * # Pilha
         * 
         * Uma Pilha é uma estrutura de dados do tipo LIFO:
         * "O último elemento inserido na pilha é o primeiro elemento que será retirado da pilha."
         * (Last In - First Out). A ideia fundamental da pilha é que só podemos inserir
         * ou retirar um elemento do topo da pilha. Essa Estrutura de dados é chamada de
         * “pilha” porque se assemelha a uma pilha do mundo real, como por exemplo uma
         * pilha de pratos, onde o último prato inserido na pilha, é o primeiro a ser
         * retirado.
         * 
         */

        Stack<String> pilha = new Stack<String>();

        pilha.push("Prato Verde");
        pilha.push("Prato Azul");
        pilha.push("Prato Branco");

        System.out.println("\nElementos da Pilha: " + pilha);

        System.out.println("\nRetirar elemento: " + pilha.pop());

        System.out.println("\nElementos da Pilha: " + pilha);

        System.out.println("\nElemento no topo da Pilha: " + pilha.peek());

        System.out.println("\nTamanho da Pilha: " + pilha.size());

        System.out.println("\nO Elemento Prato Verde existe na Pilha? " + pilha.contains("Prato Verde"));

        System.out.println("\nExibir todos os Elementos da Pilha por Iteração");

        Iterator<String> iterator2 = pilha.iterator();

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        pilha.clear();

        System.out.println("\nA Pilha está vazia? " + pilha.isEmpty());
    }
}

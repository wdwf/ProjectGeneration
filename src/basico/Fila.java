package basico;

/*
    Uma Fila é uma estrutura de dados do tipo FIFO: "o primeiro elemento que entra é o primeiro elemento que sai" (first in, first out). A ideia fundamental da fila é que só podemos inserir um novo elemento no final da fila e só podemos retirar um elemento do inicio.
*/

public class Fila {
    private int tamanhoMaximo;
    private int[] fila;
    private int inicio;
    private int fim;
    private int total;

    public Fila(int s) {
        tamanhoMaximo = s;
        fila = new int[s];
        inicio = 0;
        fim = -1;
        total = 0;
    }

    public int pegarInicio() {
        return fila[inicio];
    }

    public int pegarFim() {
        return fila[fim];
    }

    public boolean checarCheio() {
        return total == tamanhoMaximo;
    }

    public boolean checarVazio() {
        return total == 0;
    }

    // checa se esta cheia
    public void enqueue(int item) {
        if (checarCheio()) {
            System.out.println("A fila ja esta cheia");
        } else {
            fim++;
            fila[fim] = item;
            total++;
        }
    }

    // checa se esta vazia
    public void dequeue() {
        if (checarVazio()) {
            System.out.println("A fila esta vazia");
        } else {
            System.out.println("Item removido: " + fila[inicio]);
            inicio++;
            total--;
        }
    }
}

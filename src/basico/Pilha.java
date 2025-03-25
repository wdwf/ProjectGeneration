package basico;

public class Pilha {
    private int tamanhoMaximo;
    private int[] pilha;
    private int topo;

    public Pilha(int s) {
        tamanhoMaximo = s;
        pilha = new int[s];
        topo = -1;
    }

    // Adiciona itens
    public void push(int item) {
        if (topo == tamanhoMaximo - 1) {
            System.out.println("A pilha esta cheia,não posso adicionar mais itens");
        } else {
            topo++;
            pilha[topo] = item;
        }
    }

    // remove itens
    public void pop() {
        if (topo == -1) {
            System.out.println("A pilha esta vazia");
        } else {
            System.out.println("Elemento retirado da pilha: " + pilha[topo]);
            topo--;
        }
    }

    public int peek() {
        return pilha[topo];
    }
}

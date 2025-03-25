package basico;

public class InstanciandoEstruturasDeDados {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(3);

        pilha.push(10);
        System.out.println("Elemento adicionado ao topo: " + pilha.peek());

        pilha.push(20);
        System.out.println("Elemento adicionado ao topo: " + pilha.peek());

        pilha.push(30);
        System.out.println("Elemento adicionado ao topo: " + pilha.peek());

        pilha.push(40);

        pilha.pop();

        // ------------------

        Fila fila = new Fila(3);

        fila.enqueue(10);
        System.out.println("Item adicionado: " + fila.pegarFim());
        fila.enqueue(20);
        System.out.println("Item adicionado: " + fila.pegarFim());
        fila.enqueue(30);
        System.out.println("Item adicionado: " + fila.pegarFim());

        fila.enqueue(40);
        fila.dequeue();
    }
}

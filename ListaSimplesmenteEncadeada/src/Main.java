import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        SLinkedList<String> list = new SLinkedList<String>();
        list.addFirst("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.add(0 ,"0");





        System.out.println(Arrays.toString(list.toArray()));
        //System.out.println("Tamanho:"+list.size());
        //System.out.println("Esta vazia? "+list.isEmpty());
        //System.out.println(list.getFirst());
       //System.out.println(list.getLast());




       /* Nodo<String> gru = new Nodo<String>();
        gru.setValor("gru");

        Nodo<String> lis = new Nodo<String>();
        lis.setValor("lis");

        Nodo<String> hlr = new Nodo<String>();
        hlr.setValor("hlr");

        // Faz a ligação entre nós gru e lis
        gru.setProximo(lis);

        // Faz a ligação entre nós lis e hlr
        lis.setProximo(hlr);

        imprimirIterativo(gru);
        System.out.println("---");
        imprimirIterativo(lis);
        System.out.println("---");
        imprimirIterativo(hlr);
        System.out.println("---");
        imprimirIterativo(null);
    }
    public static void imprimirRecursivo(Nodo nodo){
        //criterio de parada
        if(nodo != null){
            //operação necessaria
            System.out.println(nodo.getValor());
            imprimirRecursivo(nodo.getProximo());
        }
    }
    public static void imprimirIterativo(Nodo nodo){
        while(nodo != null){
            System.out.println(nodo.getValor());
            nodo = nodo.getProximo();
        }*/
    }
}

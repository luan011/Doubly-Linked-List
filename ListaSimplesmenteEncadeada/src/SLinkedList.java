import java.util.NoSuchElementException;

public class SLinkedList<T> {

    protected Nodo<T> head;
    protected Nodo<T> tail;
    protected long size;

    public SLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public long size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }


    public T getFirst() {
        if(isEmpty()) throw new NoSuchElementException("List is empty");
        return head.getValor();
    }

    public T getLast() {
        if(isEmpty()) throw new NoSuchElementException("List is empty");
        return tail.getValor();
    }

    public void addFirst(T value) {
        Nodo<T> first = new Nodo<T>();
        first.setValor(value);
        System.out.println("Adicionando: "+ value);
        first.setProximo(head);
        if (head == null) {
            tail = first;
            head = first;
        }
        else{
            head.setAnterior(first);
            first.setProximo(head);
            head = first;
        }
        size++;
    }

    public void addLast(T value) {
        if(head == null) { // Ainda não possui head
            addFirst(value);
        }else {
            Nodo<T> last = new Nodo<T>();
            last.setValor(value);
            last.setAnterior(tail);
            tail.setProximo(last);
            tail = last;
        }
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) throw new NoSuchElementException("List is empty");
        T value = head.getValor();
        head = head.getProximo();
        if (head == null){
            tail = null;
        }
        else{
            head.setAnterior(null);
        }
        size--;
        return value;
    }
    public T removeLast() {
        if(isEmpty()) throw new NoSuchElementException("List is empty");
        T value = tail.getValor();
        tail = tail.getAnterior();
        if(tail == null){
            head = null;
        }
        else{
            tail.setProximo(null);
        }
        size--;
        return value;
    }

    public boolean contains(T value) {
        Nodo<T> temp = head;
        while(temp != null) {
            if(temp.getValor().equals(value)) {
                return true;
            }
            temp = temp.getProximo();
        }
        return false;
    }

    public Object[] toArray() {
        Object[] array = new Object[(int) size];
        Nodo<T> temp = head;
        for(int i = 0; i < size; i++) {
            array[i] = temp.getValor();
            temp = temp.getProximo();
        }
        return array;
    }

    public T get(int index) {
        if(index >= size || index < 0) throw new IndexOutOfBoundsException("index "+index);
        Nodo<T> temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.getProximo();
        }
        return temp.getValor();
    }
    public T remove(int index) {
        if(index >= size  || index < 0) throw new IndexOutOfBoundsException("index "+index);
        Nodo<T> temp = head;
        Nodo<T> before = null;
        for(int i = 0; i < index; i++) {
            before = temp;
            temp = temp.getProximo();
        }
        if(before == null) {
            head = temp.getProximo();
        }else {
            before.setProximo(temp.getProximo());
            if(temp == tail) {
                tail = before;
            }
        }
        size--;
        return temp.getValor();
    }
    public void add(int index, T value) {
        if(index > size || index < 0) throw new IndexOutOfBoundsException("index "+index);
        Nodo<T> temp = head;
        Nodo<T> before = null;
        for(int i = 0; i < index; i++) {
            before = temp;
            temp = temp.getProximo();
        }
        Nodo<T> newNode = new Nodo<T>();
        newNode.setValor(value);
        newNode.setProximo(temp);
        newNode.setAnterior(before);
        if(before == null) {
            head = newNode;
        }else {
            before.setProximo(newNode);
            if(temp == tail) {
                tail = newNode;
            }
        }
        size++;
    }
    public void set(int index, T value) {
        if(index >= size || index < 0) throw new IndexOutOfBoundsException("index "+index);
        Nodo<T> temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.getProximo();
        }
        temp.setValor(value);
    }

}

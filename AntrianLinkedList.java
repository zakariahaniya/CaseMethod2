public class AntrianLinkedList {
    Node head;
    Node tail;
    int size;

    public AntrianLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong.");
        } else {
            Node tmp = head;
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
        }
    }

    public void add(Kendaraan input) {
        Node ndInput = new Node(input);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Antrian kosong\n");
        } else if (head == tail) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
    }
}

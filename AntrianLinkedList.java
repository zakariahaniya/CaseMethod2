class AntrianLinkedList { //Khesa full//
    Node head;
    Node tail;
    int size;

    public AntrianLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void enqueue(Kendaraan kendaraan) {
        Node newNode = new Node(kendaraan);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Kendaraan dengan plat nomor " + kendaraan.getPlatNomor() + " ditambahkan ke antrian.");
    }

    public Kendaraan dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Kendaraan data = head.getData(); 
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void displayAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        Node current = head;
        System.out.println("Daftar kendaraan dalam antrian:");
        while (current != null) {
            Kendaraan kendaraan = current.getData(); // Menggunakan getter untuk mengakses data
            System.out.println("Plat Nomor: " + kendaraan.getPlatNomor() +
                               ", Tipe: " + kendaraan.getTipe() +
                               ", Merk: " + kendaraan.getMerk());
            current = current.getNext(); // Menggunakan getter untuk mengakses node berikutnya
        }
    }
}

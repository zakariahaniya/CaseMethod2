public class RiwayatQueue {
    TransaksiPengisian[] data;
    int front;
    int rear;
    int size;
    int max;

    public RiwayatQueue() {
        max = 100;
        data = new TransaksiPengisian[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(TransaksiPengisian dt) {
        if (isFull()) {
            System.out.println("Riwayat transaksi penuh.");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Riwayat Transaksi Kosong.");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].kendaraan.platNomor + ": RP " + data[i].totalBayar);
                i = (i + 1) % max;
            }
            System.out.println(data[i].kendaraan.platNomor + ": RP " + data[i].totalBayar);
        }
    }
}

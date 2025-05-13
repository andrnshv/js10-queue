package Tugas_P12;

public class Queue {
    Node front, rear;
    int size;

    public Queue() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Mahasiswa mhs) {
        Node newNode = new Node(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa dequeue.");
        } else {
            System.out.print("Mahasiswa yang dipanggil: ");
            front.data.tampil();
            front = front.next;
            size--;
            if (front == null) {
                rear = null;
            }
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian paling akhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public int count() {
        return size;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam antrian:");
            Node current = front;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }
}


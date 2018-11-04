public class NewHeap<T extends Comparable<T>>  {

    private T[] Heap;
    private int size;

    private T s;



    public NewHeap(T stu) {
        this.size = 0;
        Heap = (T []) new Comparable[100];

        s = stu;
    }

    private int parent(int p) {
        return p/2;
    }

    private int leftchild(int p) {
        return 2 * p;
    }

    private int rightchild(int p) {
        return 2 * p + 1;
    }

    private boolean isLeaf(int pos) {
        if (pos >= (size/ 2) && pos < size) {
            return true;
        }
        return false;
    }

    private void swap(int fp, int sp) {
        T t;
        t = Heap[fp];
        Heap[fp] = Heap[sp];
        Heap[sp] = t;

    }

    private void Heapify(int pos) {
        if (!isLeaf(pos))
        {
            if (s.compareTo(Heap[pos]) > s.compareTo(Heap[leftchild(pos)])  ||
                    s.compareTo(Heap[pos]) > s.compareTo(Heap[rightchild(pos)]) )
            {
                if (s.compareTo(Heap[leftchild(pos)]) < s.compareTo(Heap[rightchild(pos)]) )
                {
                    swap(pos, leftchild(pos));
                    Heapify(leftchild(pos));
                }else
                {
                    swap(pos, rightchild(pos));
                    Heapify(rightchild(pos));
                }
            }
        }
    }

    public void add(T element)
    {
        Heap[++size] = element;
        int current = size;
        while (Heap[parent(current)] != null && s.compareTo(Heap[current]) < s.compareTo(Heap[parent(current)])) {
            swap(current, parent(current));
            current = parent(current);
        }
    }


    public void print()
    {
        for (int i = 1; i <= size / 2; i++ )
        {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i]
                    + " RIGHT CHILD :" + Heap[2 * i  + 1]);
            System.out.println();
        }
    }

    public void buildheap()
    {
        for (int pos = (size / 2); pos >= 1; pos--)
        {
            Heapify(pos);
        }
    }

    public T remove()
    {
        T popped = Heap[1];
        Heap[1] = Heap[size--];
        Heapify(1);
        return popped;
    }

    public static void main(String...arg)
    {
        System.out.println("The Max Heap is ");
        Heap maxHeap = new Heap();
        maxHeap.add(new Integer(5));
        maxHeap.add(new Integer(3));
        maxHeap.add(new Integer(17));
        maxHeap.add(new Integer(10));
        maxHeap.add(new Integer(84));
        maxHeap.add(new Integer(19));
        maxHeap.add(new Integer(6));
        maxHeap.add(new Integer(22));
        maxHeap.add(new Integer(9));
        maxHeap.buildheap();

        maxHeap.print();
        System.out.println("The max val is " + maxHeap.remove());
    }




}
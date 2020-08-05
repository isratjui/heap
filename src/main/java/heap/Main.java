package heap;

public class Main {

    /**
     * @param args the command line arguments
     */

    public static void printArray(int B[])

    {
        for(int x: B)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // TODO code application logic here
        Heap heap=new Heap();
        printArray(heap.A);
        heap.Build_Max_Heap();
        printArray(heap.A);
        //heap.Heapsort();
        //printArray(heap.A);
        heap.Heap_increase_key(heap.A,4,40);//correct
        //heap.Build_Max_Heap();

        printArray(heap.A);
        heap.Max_heap_insert(heap.A,60);
        printArray(heap.A);

        heap.Heapsort();
        printArray(heap.A);

    }

}


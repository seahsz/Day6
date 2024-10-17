package Task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        
        MyImplementation my1 = new MyImplementation();
        MyImplementation my2 = new MyImplementation();
        MyImplementation my3 = new MyImplementation();
        MyImplementation my4 = new MyImplementation();
        MyImplementation my5 = new MyImplementation();
    
        // Running using a single thread
        // ExecutorService es = Executors.newSingleThreadExecutor();
        // es.execute(my1);
        // es.execute(my2);
        // es.shutdown();
    
    
        // Running using multiple threads
        ExecutorService es1 = Executors.newFixedThreadPool(5);
        es1.execute(my1);
        es1.execute(my2);
        es1.execute(my3);
        es1.execute(my4);
        es1.execute(my5);
        es1.shutdown();

    }


    
    
}

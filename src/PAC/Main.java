package PAC;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        List<PCData> queue = new ArrayList<PCData>();
        int length = 10;
        Producer p1 = new Producer(queue,length);
        Producer p2 = new Producer(queue,length);
        Producer p3 = new Producer(queue,length);
        Consumer c1 = new Consumer(queue);
        Consumer c2 = new Consumer(queue);
        Consumer c3 = new Consumer(queue);
        ExecutorService service = Executors.newCachedThreadPool();
        for(int i=0; i<100; i++){
            Consumer c = new Consumer(queue);
            service.execute(c);
        }
        for(int i=0; i<100; i++){
            Producer p = new Producer(queue,length);
            service.execute(p);
        }
//        service.execute(c1);
//        service.execute(c2);
//        service.execute(c3);
//        service.execute(p1);
//        service.execute(p2);
//        service.execute(p3);
    }
}

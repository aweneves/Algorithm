package PAC1;

public class Main {
    public static void main(String[] args){
        Storage storage = new Storage();

        for(int i=0; i<3; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    storage.consume("consumer");
                }
            }).start();
        }
        for(int i=0; i<3; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    storage.produce("producer");
                }
            }).start();
        }
    }
}

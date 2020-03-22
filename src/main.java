public class main {
    public static void main(String[] args) {
        Thread thread=new Thread(new AddThread());
        Thread thread1=new Thread(new MinusThread());
        Thread thread2=new Thread(new DivisionThread());
        Thread thread3=new Thread(new MultiplyThread());
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

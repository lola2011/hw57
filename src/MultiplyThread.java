public class MultiplyThread implements Runnable {
    @Override
    public void run() {
multiply(4,"multiply");
    }

    static void multiply(int n, String text) {
        System.out.println(text + "=" + 2 * n );

    }

}





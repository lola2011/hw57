public class MinusThread implements Runnable {
    @Override
    public void run() {
subtract(4,"subtract");
    }
    static void subtract(int n, String text) {
        System.out.println(text + "=" + (n - 2));
    }
}

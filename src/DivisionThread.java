public class DivisionThread implements Runnable {
    @Override
    public void run() {
divide(4,"divide");
    }

    static void divide(int n, String text) {
        System.out.println(text + "=" + n / 2);
    }
}
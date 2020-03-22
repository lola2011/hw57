public class AddThread implements Runnable {
    @Override
    public void run() {
add(4,"add");
    }
    static void add(int n, String text) {
        System.out.println(text + "=" + (n + 2));

    }
}

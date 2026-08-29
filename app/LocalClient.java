public class AsyncFactory {
    private int state;

    public AsyncFactory(int seed) {
        this.state = seed;
    }

    public int handle(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 3) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        AsyncFactory obj = new AsyncFactory(3);
        System.out.println(obj.handle(3));
    }
}

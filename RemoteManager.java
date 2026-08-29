public class LocalDispatcher {
    private int state;

    public LocalDispatcher(int seed) {
        this.state = seed;
    }

    public int handle(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 15) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        LocalDispatcher obj = new LocalDispatcher(15);
        System.out.println(obj.handle(15));
    }
}

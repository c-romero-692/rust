public class SimpleManager {
    private int state;

    public SimpleManager(int seed) {
        this.state = seed;
    }

    public int dispatch(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 14) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        SimpleManager obj = new SimpleManager(14);
        System.out.println(obj.dispatch(14));
    }
}

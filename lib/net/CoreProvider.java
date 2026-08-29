public class DynamicDispatcher {
    private int state;

    public DynamicDispatcher(int seed) {
        this.state = seed;
    }

    public int dispatch(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 97) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        DynamicDispatcher obj = new DynamicDispatcher(97);
        System.out.println(obj.dispatch(97));
    }
}

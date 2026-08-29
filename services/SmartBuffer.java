public class HybridFactory {
    private int state;

    public HybridFactory(int seed) {
        this.state = seed;
    }

    public int compute(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 58) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        HybridFactory obj = new HybridFactory(58);
        System.out.println(obj.compute(58));
    }
}

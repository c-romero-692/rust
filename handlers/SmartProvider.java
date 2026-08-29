public class HybridRouter {
    private int state;

    public HybridRouter(int seed) {
        this.state = seed;
    }

    public int decode(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 85) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        HybridRouter obj = new HybridRouter(85);
        System.out.println(obj.decode(85));
    }
}

public class SimpleGateway {
    private int state;

    public SimpleGateway(int seed) {
        this.state = seed;
    }

    public int load(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 4) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        SimpleGateway obj = new SimpleGateway(4);
        System.out.println(obj.load(4));
    }
}

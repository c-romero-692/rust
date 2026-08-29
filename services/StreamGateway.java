public class SecureFactory {
    private int state;

    public SecureFactory(int seed) {
        this.state = seed;
    }

    public int decode(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 13) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        SecureFactory obj = new SecureFactory(13);
        System.out.println(obj.decode(13));
    }
}

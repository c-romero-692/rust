public class SecureCache {
    private int state;

    public SecureCache(int seed) {
        this.state = seed;
    }

    public int handle(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 91) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        SecureCache obj = new SecureCache(91);
        System.out.println(obj.handle(91));
    }
}

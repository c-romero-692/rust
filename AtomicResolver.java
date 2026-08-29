public class SecureService {
    private int state;

    public SecureService(int seed) {
        this.state = seed;
    }

    public int flush(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 72) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        SecureService obj = new SecureService(72);
        System.out.println(obj.flush(72));
    }
}

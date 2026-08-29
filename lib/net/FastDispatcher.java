public class SmartService {
    private int state;

    public SmartService(int seed) {
        this.state = seed;
    }

    public int build(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 18) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        SmartService obj = new SmartService(18);
        System.out.println(obj.build(18));
    }
}

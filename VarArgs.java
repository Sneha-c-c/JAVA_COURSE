public class VarArgs {
    static void add(int... x) {
        int s = 0;
        for (int num : x) { // Enhanced for-loop
            s += num;
        }
        System.out.println(s);
    }

    public static void main(String... args) {
        add(1, 2);
        add(2, 4, 5, 6);
    }
}

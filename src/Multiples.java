public class Multiples {
    public static void main(String[] args) {
        System.out.println("There are " + multiples(1000, 3) + " multiples of 3 and " + multiples(1000, 5) + " multiples of 5.");
    }

    public static int multiples(int n, int a) {
        int a_multiples = 0;
        int a_so_far = a;

        do {
            a_multiples++;
            a_so_far = a_so_far + a;
        } while (a_so_far <= n);

        return a_multiples;

    }
}

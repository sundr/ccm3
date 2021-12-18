import java.util.Scanner;

/**
 *
 * @author sundr
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println(re(scan.nextInt()));
    }

    static int fb(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return fb(n - 1) + fb(n - 2);
    }

    static int re(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + re(n - 1);
        }

    }
}

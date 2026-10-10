```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        k = k % n;

        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = names[i];
        }

        System.out.print("Rotated roster: [");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}
```
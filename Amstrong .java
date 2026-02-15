import java.util.*;

class Armstrong {

    int num(int n) {
        int originalNumber = n;
        int result = 0;
        int temp = n;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
}
        if (result == originalNumber) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }

        return result;
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Armstrong a = new Armstrong();
        a.num(n);

        sc.close();
    }
}

package chapter4;

public class Factorial {

    public int factorialSum(int num) {
        int total;
        if (num == 1) { //종료 조건
            return 1;
        } else {
            total = num * factorialSum(num - 1);
            return total;
        }
    }

    public int factorialIter(int num) {

        int total = 1;

        for (int i = 1; i < num; i++) {
            total *= i;
        }

        return total;
    }

    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        int total = factorial.factorialSum(10);
        System.out.println(total);
    }
}


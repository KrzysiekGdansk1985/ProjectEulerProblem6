import static java.lang.Math.pow;

/*
Sum square difference

Problem 6
The sum of the squares of the first ten natural numbers is,

1^2+2^2+...+10^2=385

The square of the sum of the first ten natural numbers is,

(1+2+...+10)^2=55^2=3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class EulerProblem6 {
    public static void main(String[] args) {
        int n = 100;
        int difference;

        difference = SquareOfTheSum(n) - SumOfTheSquares(n);

        System.out.println("The difference between the sum of the squares of the first one hundred natural numbers");
        System.out.println("and the square of the sum is " + difference + ".");
    }

    public static int SumOfTheSquares(int x){
        int sumOfTheSquares = 0;
        for (int i = 1; i <= x; i++) {
            sumOfTheSquares += pow(i, 2);
        }
        return sumOfTheSquares;
    }

    public static int SquareOfTheSum(int x) {
        int k = 0;
        int squareOfTheSum = 0;
        for (int i = 1; i <= x; i++) {
            k += i;
        }
        squareOfTheSum = (int) pow(k, 2);
        return squareOfTheSum;
    }
}
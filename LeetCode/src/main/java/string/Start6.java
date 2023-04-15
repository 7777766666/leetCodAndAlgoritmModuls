package string;

import static string.Lambda.plus;

public class Start6 {



    public static void main(String[] args) {
        int z1 = 7;
        int z2 = 17;

        SumLambda sumLambda = new SumLambda(333, 555);
        System.out.println(plus(sumLambda.a, sumLambda.b));


//        Lambda myLambda = () -> sumLambda.a + sumLambda.b;
//        int result = myLambda.plus(0, 0); // Call the plus method on the lambda expression with dummy arguments
//        System.out.println(result); // Prints "888"


    }
}

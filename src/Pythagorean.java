public class Pythagorean {


    private static double square(double num) {
        return Math.pow(num, 2);
    }

//    A^2 + B^2 = C^2
    double side_a;
    double side_b;
    double hypotenuse;



    public double getHypotenuse(double side_a, double side_b) {
        System.out.println("side a:" + Math.pow(side_a,2));
        System.out.println("Side b:" + Math.pow(side_b,2));

        hypotenuse = Math.sqrt(square(side_a) + square(side_b));

        return hypotenuse;
    }



    //return the square root of A^2 + B^2

}



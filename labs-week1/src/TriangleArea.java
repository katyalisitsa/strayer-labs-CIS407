import java.util.ArrayList;
import java.util.Scanner;

    /*
    * Given class Triangle (in file Triangle.java), complete main()
    * to read and set the base and height of triangle1 and of triangle2,
    * determine which triangle's area is larger, and output that triangle's
    * info, making use of Triangle's relevant public methods.
    *  Ex: If the input is 3.0 4.0 4.0 5.0 (where 3.0 is triangle1's base, 4.0
    * is triangle1's height, 4.0 is triangle2's base, and 5.0 is triangle2's height),
    * the output is:
    *   Triangle with larger area:
    *   Base: 4.0
    *   Height: 5.0
    *   Area: 10.0
    */

public class TriangleArea {
    public static void main(String[] args) {


        boolean is1LargerArea = false;

        Scanner scnr = new Scanner(System.in);

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        ArrayList<Double> userInputs = new ArrayList<Double>();

        for (int i = 0; i < 4; i++) {

            userInputs.add(scnr.nextDouble());

        }

        // Read and set base and height for triangle1 (use setBase() and setHeight())

        triangle1.setBase(userInputs.get(0));
        triangle1.setHeight(userInputs.get(1));

        // Read and set base and height for triangle2 (use setBase() and setHeight())

        triangle2.setBase(userInputs.get(2));
        triangle2.setHeight(userInputs.get(3));

        // Determine larger triangle (use getArea())

        triangle1.getArea();
        triangle2.getArea();

        if (triangle1.getArea() > triangle2.getArea()) {
            is1LargerArea = true;
        }

        System.out.println("Triangle with larger area:");
        // Output larger triangle's info (use printInfo())

        if (is1LargerArea) {
            triangle1.printInfo();
        } else {
            triangle2.printInfo();
        }

    }
}

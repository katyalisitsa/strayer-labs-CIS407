import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

    // TODO: Define a PrintArrayList method that prints an ArrayList of plant (or flower) objects
    public static void printArrayList(ArrayList<Plant>myGarden) {

        for (int i = 0; i < myGarden.size(); ++i) {
            myGarden.get(i).printInfo();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        // TODO: Declare an ArrayList called myGarden that can hold object of type plant
        ArrayList<Plant> myGarden = new ArrayList<>();

        // TODO: Declare variables - plantName, plantCost, colorOfFlowers, isAnnual
        String plantName;
        String plantCost;
        String colorOfFlowers;
        boolean isAnnual;

        input = scnr.next();
        while (!input.equals("-1")) {

            // TODO: Check if input is a plant or flower
            plantName = scnr.next();
            plantCost = scnr.next();

            if (input.equals("plant")) {
                Plant myPlant = new Plant();
                myPlant.setPlantName(plantName);
                myPlant.setPlantCost(plantCost);
                myGarden.add(myPlant);
            }else{
                Flower myFlower = new Flower();
                myFlower.setPlantName(plantName);
                myFlower.setPlantCost(plantCost);
                isAnnual=scnr.nextBoolean();
                colorOfFlowers=scnr.next();
                myFlower.setPlantType(isAnnual);
                myFlower.setColorOfFlowers(colorOfFlowers);
                myGarden.add(myFlower);
            }

            //       Store as a plant object or flower object
            //       Add to the ArrayList myGarden


            input = scnr.next();
        }


    // TODO: Call the method PrintArrayList to print myGarden
    printArrayList(myGarden);


}
}

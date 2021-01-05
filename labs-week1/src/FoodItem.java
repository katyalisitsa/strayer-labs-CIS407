public class FoodItem {

    /*
    * Given main(), complete the FoodItem class (in file FoodItem.java)
    * with constructors to initialize each food item. The default constructor
    * should initialize the name to "None" and all other fields to 0.0.
    * The second constructor should have four parameters (food name, grams of fat,
    * grams of carbohydrates, and grams of protein) and should assign each private
    * field with the appropriate parameter value.
    */

    private String name;
    private double fat;
    private double carbs;
    private double protein;

    // TODO: Define default constructor

    public FoodItem() {
        this.name = "None";
        this.fat = 0.0;
        this.carbs = 0.0;
        this.protein = 0.0;
    }

    // TODO: Define second constructor with arguments to initialize
    //       private fields (name, fat, carbs, protein)

    public FoodItem(String name, double fat, double carbs, double protein) {
        this.name = name;
        this.fat = fat;
        this.carbs = carbs;
        this.protein = protein;
    }

    public String getName() {
        return name;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getProtein() {
        return protein;
    }

    public double getCalories(double numServings) {
        // Calorie formula
        double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
        return calories;
    }

    public void printInfo() {
        System.out.println("Nutritional information per serving of " + name + ":");
        System.out.println("   Fat: " + fat + "g");
        System.out.println("   Carbohydrates: " + carbs + "g");
        System.out.println("   Protein: " + protein + "g");
    }
}
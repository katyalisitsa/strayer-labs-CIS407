public class Triangle {
    private double base;
    private double height;

    public void setBase(double userBase){
        base = userBase;
    }
    public void setHeight(double userHeight) {
        height = userHeight;
    }

    public double getArea() {
        double area = 0.5 * base * height;
        return area;
    }

    public void printInfo() {
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
    }
}
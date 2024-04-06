public class circle {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
  
        circle myCircle = new circle(5.0);
    }
}
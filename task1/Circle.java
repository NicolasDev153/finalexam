package finalexam.task1;

public class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void Draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

public class MainTess {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(10, "Blue", 15);
        System.out.println(cylinder.toString());
    }
}

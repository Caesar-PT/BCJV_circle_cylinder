public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }

    public Cylinder(double r, String color, double height){
        super(r, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumeCylinder(){
        return getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Thể tích hình trụ là: " + getVolumeCylinder() +
                " Đáy là: "
                + super.toString();
    }
}

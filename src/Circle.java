public class Circle {
    private double r = 1;
    private String color = "black";

    public Circle(){
    }

    public Circle(double r){
        this.r = r;
    }

    public Circle(double r, String color){
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimeter(){
        return 2 * Math.PI * r;
    }

    public double getArea(){
        return r * r * Math.PI;
    }

    @Override
    public String toString() {
        return "Hình tròn có bán kính: " + r + " Chu vi: " + getPerimeter() +
                " Diện tích: " + getArea() + " Màu: " + getColor()
                ;
    }
}

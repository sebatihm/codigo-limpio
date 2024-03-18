public class Triangle extends Figure {
    private double width;
    private double heigth;

    public Triangle(int numberofSides, double width, double heigth) {
        super(numberofSides);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return (this.heigth*this.width)/2;
    }

    @Override
    public double getPerimeter() {
        return this.width*3;
    }

    @Override
    public String toString(){
        return "Figure: Triangle\nWidth: " + getWidth() + "\nHeigth: " + getHeigth() + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
    }
    
    
}

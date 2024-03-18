public class Rectangle extends Figure implements Resize{
    private double width;
    private double heigth;
    
    public Rectangle(int numberofSides, double width, double heigth) {
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
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return width*heigth;
    }

    @Override
    public double getPerimeter() {
        return (width*2) + (heigth*2);
    }

    @Override
    public void resizeX(int factorX) {
       this.heigth = this.heigth/factorX;
       this.width = this.width/factorX;
        
    }

    @Override
    public String toString(){
        return "Figure: Rectangle\nWidth: " + getWidth() + "\nHeigth: " + getHeigth() + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
    }
    
}

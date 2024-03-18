public abstract class Figure{
    private int numberofSides;

    protected Figure(int numberofSides){
        this.numberofSides = numberofSides;
    }

    public int getNumberofSides(){
        return this.numberofSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
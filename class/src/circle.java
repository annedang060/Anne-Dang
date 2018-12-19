public class circle {
    //fields
   private double radius = 1.0;
    //constructors
    //Methods
    //comments above the methods
    public double getRadius(){
        return radius;
    }
    //plus sign is public
    public void setRadius(double radius){
        //this radius is held in a different location
        //how do you set this radius to the other one?
        this.radius = radius;

    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public String toString(){
        return "Circle[radius =]" + radius;
    }
    //ignore first method
    //after : = return type
    //void means no return type
    // classes ALWAYS have caps
}

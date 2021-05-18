package sheet4;

public class Q1_Rectangle {
    double width = 1;
    double height = 1;

    public Q1_Rectangle() {
        
    }
    
    public Q1_Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return this.width * this.height;
    }
    
    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }
    
}

class RectangleTest {
    public static void main(String[] args) {
        Q1_Rectangle R1 = new Q1_Rectangle(4, 40);
        Q1_Rectangle R2 = new Q1_Rectangle(3.5, 35.9);
        
        System.out.println("R1 width: " + R1.width + "  R1 height: " + R1.height);
        System.out.println("R2 width: " + R2.width + "  R2 height: " + R2.height);
        
        System.out.println("R1 Area: " + R1.getArea() + "  R1 Premiter" + R1.getPerimeter());
        System.out.println("R2 Area: " + R2.getArea() + "  R2 Premiter" + R2.getPerimeter());
    }
}
class Rectangle {
    private final int length,breadth;
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    public float findArea(){
        return (length*breadth); 
    }
    public float findPerimeter(){
        return 2*(length+breadth); 
    }
}
public class MyRectangle {
    public static void main(String[]args){
        Rectangle r1 = new Rectangle(4,2);
        System.out.println("Area= "+r1.findArea());
        System.out.println("Perimeter= "+r1.findPerimeter());

    }
}
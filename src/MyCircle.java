class Circle {
    private final float radius;
    public Circle(float r){
        radius = r;
    }
    public float findArea(){
        return (float)Math.PI * radius * radius; 
    }
    public float findCircumference(){
        return 2 * (float)Math.PI * radius; 
    }
}

public class MyCircle {
    public static void main(String[]args){
        Circle c1 = new Circle(3);
        System.out.println("Area= "+c1.findArea());
        System.out.println("Circumference= "+c1.findCircumference());

    }
}
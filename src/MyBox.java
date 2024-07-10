class Box {
    private final int width,height,depth;
    public Box(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }
    public int findVolume(){
        return width * height * depth;
    }
    public int findSurfaceArea(){
        return 2*((width*height) + (height*depth) + (width * depth));
    }
}
public class MyBox {
    public static void main(String[]args){
        Box b1 = new Box(5,2,3);
        Box b2 = new Box(6,3,4);
        System.out.println("The volume of Box b1 is "+ b1.findVolume() + " and the Surface Area is "+ b1.findSurfaceArea());
        System.out.println("The volume of Box b2 is "+ b2.findVolume() + " and the Surface Area is "+ b2.findSurfaceArea());
    }
}

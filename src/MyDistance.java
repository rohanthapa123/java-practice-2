class Distance {
    private int feet;
    private float inches;    
    public Distance(int f, float i){
        feet = f;
        inches = i;
    }
    public int getFeet(){
        return feet;
    }
    public float getInches(){
        return inches;
    }
    public void addDistance(Distance other){
        feet += other.feet;
        inches += other.inches;
        if (inches >= 12) {
            inches -= 12;
            feet++;
        }
    }
    public float compareDistance(Distance other){
        float thisTotalInches = feet * 12 + inches;
        float otherTotalInches = other.feet * 12 + other.inches;
        
        if (thisTotalInches < otherTotalInches) {
            return -1;
        } else if (thisTotalInches > otherTotalInches) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class MyDistance {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8.5f);
        Distance d2 = new Distance(3, 10.25f);
        
        System.out.println("Distance 1: " + d1.getFeet() + " feet " + d1.getInches() + " inches");
        System.out.println("Distance 2: " + d2.getFeet() + " feet " + d2.getInches() + " inches");
        
        d1.addDistance(d2);
        System.out.println("Distance 1 after adding Distance 2: " + d1.getFeet() + " feet " + d1.getInches() + " inches");
        
        float comparison = d1.compareDistance(d2);
        if (comparison < 0) {
            System.out.println("Distance 1 is shorter than Distance 2");
        } else if (comparison > 0) {
            System.out.println("Distance 1 is longer than Distance 2");
        } else {
            System.out.println("Distance 1 is equal to Distance 2");
        }
    }
}
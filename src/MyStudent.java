class Student {
    private final String name;
    private final int roll;
    private float[] marks;
    private float total;
    public Student(String nam,int rn,float[] marks){
        name = nam;
        roll = rn;
        this.marks = marks;
        for (float mark : marks) {
            total += mark;
        }
    }
    public String getName(){
        return name;
    }
    public int getRoll(){
        return roll;
    }
    public float getTotal(){
        return total;
    }
    
    public String Division(){
        if(marks[0] >= 40 && marks[1] >= 40 && marks[2] >= 40 && marks[3] >=40 && marks[4] >=40){
            if(total >= 80)
                return "Destinction";
            else if(total >= 70)
                return "First Division";
            else if(total >= 60)
                return "Second Division";
            else if(total >= 50)
                return "Third Division";
            else
                return "Just Pass";
        }else{
            return "Fail";
        }
    }
    public float Percentage(){
        return (total/500)*100;
    }
    
}
public class MyStudent {
    public static void main(String[]args){
        float[] marks1 = {75, 80, 20, 85, 70};
        float[] marks2 = {60, 70, 55, 45, 65};
        float[] marks3 = {50, 40, 65, 75, 80};
        float[] marks4 = {35, 45, 30, 50, 40};
        float[] marks5 = {80, 85, 75, 90, 95};
        
        
        Student s1 = new Student("Ram",1,marks1);
        Student s2 = new Student("Shyam",2,marks2);
        Student s3 = new Student("Hari",3,marks3);
        Student s4 = new Student("Krishna",4,marks4);
        Student s5 = new Student("Govinda",5,marks5);
        
        Student[] students = {s1, s2, s3, s4, s5};

        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll No: " + student.getRoll());
            System.out.println("Total Marks: " + student.getTotal());
            System.out.println("Percentage: " + student.Percentage());
            System.out.println("Division: " + student.Division());
            System.out.println();
        }
    } 
}

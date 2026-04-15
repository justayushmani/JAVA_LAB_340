public class student {
    private int rollNo;
    private String name;
    private int marks;

    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setMarks(int marks){
        this.marks=marks;
    }



    public static void main(String[] args) {
        student s1 = new student();
        s1.rollNo = 1;
        s1.name = "Ayush";
        s1.marks = 85;

        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Name: " + s1.name);
        System.out.println("Marks: " + s1.marks);
    }

    
}

public class Student {

    private  String name;
    private int id;
    private int psp;
    public void solvedProblem(int count)
    {
         this.psp += count;
         System.out.println("Problem solved by " + this.name + " ID :" + this.id + " total count is: " + this.psp);
    }
  // Constructor
    public Student(String name , int id)
    {
         this.name = name;
         this.id = id;
    }

}

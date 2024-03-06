package JavaNotesPrograms;

public class StudentGS {
    // Student
   private int Rollnumber;
   private String name;
   public int age;
    public void display(){
        System.out.println(this.name);
        System.out.println(this.Rollnumber);
    }
    public String getName(){
        return name;
    }
    public void setName(String Nam){
        this.name=Nam;
    }
    public int getRollnumber(){

        return Rollnumber;
    }
    public void setRollnumber(int Roll){
        if(Roll<0){
            throw new IllegalArgumentException("-1 not allow as a Rollnumber");
        }
        this.Rollnumber=Roll;
    }

}

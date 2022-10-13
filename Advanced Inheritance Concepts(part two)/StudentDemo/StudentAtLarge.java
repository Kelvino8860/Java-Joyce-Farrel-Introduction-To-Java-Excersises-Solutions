public class StudentAtLarge extends Student
{
    public StudentAtLarge(long idNum, String name)
       {
           super(idNum, name); 
           setTuition();  
       }

    @Override
    public void setTuition()
       {
          annualTuition = 2000;
       }
}
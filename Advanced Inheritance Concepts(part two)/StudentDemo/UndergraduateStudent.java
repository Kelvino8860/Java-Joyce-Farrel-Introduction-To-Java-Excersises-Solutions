public class UndergraduateStudent extends Student
{
    public UndergraduateStudent(long idNum, String name)
       {
           super(idNum, name);  
           setTuition(); 
       }

    @Override
    public void setTuition()
       {
          annualTuition = 4000;
       }
}
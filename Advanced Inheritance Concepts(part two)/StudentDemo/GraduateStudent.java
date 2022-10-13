public class GraduateStudent extends Student
{
    public GraduateStudent(long idNum, String name)
       {
           super(idNum, name);
           setTuition();   
       }

    @Override
    public void setTuition()
       {
          annualTuition = 6000;
       }
}
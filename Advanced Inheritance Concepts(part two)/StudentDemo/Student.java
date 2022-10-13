public abstract class Student
{
    private long idNum;
    private String lastName;
    protected int annualTuition;

    public Student(long idNum, String name)
      {
          this.idNum = idNum;
          lastName = name;
      }

    public long getIdNum()
       {
           return idNum;
       }
    public String getLastName()
       {
           return lastName;
       }
    public int getTuition()
       {
           return annualTuition;
       }

    public void setIdNum(long id)
       {
           idNum = id;
       }
    public void setLastName(String name)
       {
           lastName = name;
       }
    public abstract void setTuition();
}
public class Coordinator extends Employee
{
     @Override
     public void setPayRate(double rate)
        {
           if(rate <= 20.00)
             {
                 payRate = rate;
             }
          setJobTitle();
        }

     @Override
     public void setJobTitle()
       {
          jobTitle = "coordinator";
       }
}
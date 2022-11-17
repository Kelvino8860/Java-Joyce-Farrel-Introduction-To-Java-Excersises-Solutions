public class Waitstaff extends Employee
{
     @Override
     public void setPayRate(double rate)
        {
           if(rate <= 10.00)
             {
                 payRate = rate;
             }
           setJobTitle();
        }

     @Override
     public void setJobTitle()
       {
          jobTitle = "waitstaff";
       }
}
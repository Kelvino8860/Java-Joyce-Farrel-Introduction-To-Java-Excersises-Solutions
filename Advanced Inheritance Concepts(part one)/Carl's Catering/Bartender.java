public class Bartender extends Employee
{
     @Override
     public void setPayRate(double rate)
        {
           if(rate <= 14.00)
             {
                 payRate = rate;
             }
           setJobTitle();
        }

     @Override
     public void setJobTitle()
       {
          jobTitle = "bartender";
       }
}
public class EmployeeException extends Exception implements EmployeeMessages
{
      public EmployeeException(int value) throws EmployeeException
        {
            super(messages[value]);
        }
      
}
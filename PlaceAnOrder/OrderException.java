public class OrderException extends Exception implements OrderMessages
{
     public OrderException(int values)
       {
         super(messages[values]);
       }
}
public class Poem
{
   private String name;
   private int numLines;

   public Poem(String name, int num)
     {
        this.name = name;
        numLines = num;
     }

   public String getName()
     {
         return name;
     }
   public int getNumLines()
     {
        return numLines;
     }

   public void display()
     {
       System.out.println("Title: " + getName() +
             "\nNumber of Lines: " + getNumLines() + "\n");
     }
}
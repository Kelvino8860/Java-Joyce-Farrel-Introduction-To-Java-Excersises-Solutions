public class LoadedDie extends Die
{

   public LoadedDie()
     {
       randomValue = ((int)(Math.random() * 100) % 6 + 1);
       randomMine = ((int)(Math.random() * 100) % 6 + 2);
     }
}
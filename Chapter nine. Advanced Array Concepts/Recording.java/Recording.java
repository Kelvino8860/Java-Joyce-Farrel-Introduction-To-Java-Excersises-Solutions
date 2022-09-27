/* 3. a. Radio station JAVA wants a class to keep track of recordings it plays. Create
         a class named Recording that contains fields to hold methods for setting and
         getting a Recording’s title, artist, and playing time in seconds. Save the file
         as Recording.java.*/

public class Recording{
     private String title;
     private String artist;
     private int seconds;

   public Recording(){
      }

   public void setTitle(String title){
         this.title = title;
      }
   public String getTitle(){
          return title;
      }
  
   public void setArtist(String artist){
         this.artist = artist;
      }
   public String getArtist(){
         return artist;
      }

  public void setSeconds(int time){
         seconds = time;
     }
  public int getSeconds(){
        return seconds;
    }
}
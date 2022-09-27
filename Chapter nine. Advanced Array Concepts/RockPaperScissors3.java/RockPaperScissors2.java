 /* 4. In Chapter 7, you improved a Rock Paper Scissors game played between a user and
       the computer. Add an enumeration that holds three values that represent ROCK,
       PAPER, and SCISSORS, and use it for all comparisons in the program. Save the file as
       RockPaperScissors3.java */


import java.util.Scanner;
public class RockPaperScissors2
{   
        enum Game {PAPER, ROCK, SCISSORS};

   public static void main(String[]   args)
      {  String player;                       
         int countComputerWin = 0;                                  
         int playerInt = 0;                   
         int countTie = 0;                   
         final int LIMIT = 10;                                        
         int countPlayerWin = 0;              
         Scanner inputDevice = new Scanner(System.in);

         Game gamePaper = Game.PAPER;
         Game gameRock = Game.ROCK;
         Game gameSci = Game.SCISSORS;

             System.out.println("WELCOME TO ROCK, PAPER, SCISSORS GAME");

             for(int i = 0; i < LIMIT; ++i)
                   {  
                       int randomInt = (int)(Math.random()*3);
                       System.out.print("Enter rock, paper or scissors to play >> ");
                       player = inputDevice.nextLine();

                         while(true) 
                           {  
                               if(player.toLowerCase().startsWith("sc") || player.toLowerCase().startsWith("ro") ||
                                  player.toLowerCase().startsWith("pa"))
                                    break;
                               else
                                  {   System.out.print("Enter rock, paper or scissors to play >> ");
                                        player = inputDevice.nextLine();
                                   }
                             }     
                             if(player.toLowerCase().startsWith("ro"))
                                 {  playerInt = gameRock.ordinal();
                                     }
                             else
                               if(player.toLowerCase().startsWith("pa"))
                                   {  playerInt = gamePaper.ordinal();
                                     }
                             else
                               if(player.toLowerCase().startsWith("sc"))
                                    {  playerInt = gameSci.ordinal();
                                      }
                      if(playerInt == randomInt)
                           {   System.out.println("THE GAME WAS A TIE!!!");
                                 ++countTie;
                            }
                      if((playerInt == gameSci.ordinal() && randomInt == gamePaper.ordinal()) || (playerInt == gameRock.ordinal() && randomInt == gameSci.ordinal()) ||
                          (playerInt == gamePaper.ordinal() && randomInt == gameRock.ordinal()))
                           {  System.out.println("CONGRATULATIONS!!!PLAYER WINS!!!");
                                 ++countPlayerWin;
                            }
                    else
                      if((randomInt == gameSci.ordinal() && playerInt == gamePaper.ordinal()) || (randomInt == gameRock.ordinal() && playerInt == gameSci.ordinal()) ||
                          (randomInt == gamePaper.ordinal() && playerInt == gameRock.ordinal()))
                               { System.out.println("SORY!!!COMPUTER WINS!!!");
                                    ++countComputerWin;
                                 }
                    }   
              System.out.println("\nTOTAL NUMBER OF PLAYER'S WIN : " + countPlayerWin + "\nTOTAL NUMBER OF COMPUTER'S WIN : " + countComputerWin +
                                 "\nTOTAL NUMBER OF TIES : " + countTie);           
        }
}
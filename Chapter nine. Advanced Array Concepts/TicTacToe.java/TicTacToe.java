/* 2. a. Create a Tic Tac Toe game. In this game, two players alternate placing Xs
         and Os into a grid until one player has three matching symbols in a row,
         horizontally, vertically, or diagonally. Create a game in which the user is
         presented with a three-by-three grid containing the digits 1 through 9.
         When the user chooses a position by typing a number, place an X in the
         appropriate spot. Generate a random number for the position where the
         computer will place an O. Do not allow the player or the computer to
         place a symbol where one has already been placed. Figure 9-29 shows the
         first four windows in a typical game. When either the player or computer
         has three symbols in a row, declare a winner; if all positions have been
         exhausted and no one has three symbols in a row, declare a tie. Save the
         game as TicTacToe.java.*/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class TicTacToe{
      public static void main(String[]  args){
            
                final String PLAY = "X";
                final String COMP = "O";
                int countPlay = 0;

                String[][] array = {{"1", "2", "3"},
                                    {"4", "5", "6"},
                                    {"7", "8", "9"}};
                 
                JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe. \nYou will have X and the computer will have O");

          do{
                
                StringBuilder numberArray = new StringBuilder();
                int count = 0;
                   
                     for(int row = 0; row < array.length; ++row)
                        {
                           for(int col = 0; col < array.length; ++col)
                              {
                                numberArray.append(array[row][col] + "  ");
                                count++;

                                if(count == 3)
                                  {
                                    numberArray.append("\n");
                                    count = 0;
                                  }
                              }
                         }   

                  //PLAYER
                    boolean playerSame = false;
                     do{
                          String inputVal = JOptionPane.showInputDialog(null,"Enter the position you want to play\n" + numberArray);
                          for(int row = 0; row < array.length; row++)
                           {
                             for(int col = 0; col < array[row].length; ++col)
                              {
                                  if(inputVal.equals(array[row][col]))
                                      {
                                           array[row][col] = PLAY;
                                           playerSame = true;
                                       }
                               }
                           }
                        }while(playerSame != true);
                           
                          countPlay+=1; 
                           
                        //DETERMINE IF PLAYER HAS WON
                             boolean playerWin = false;
 
                                      //horizontal win
                               for(int row = 0; row < array.length; ++row)
                                    {
                                         if(array[row][0].equals(array[row][1]) && array[row][1].equals(array[row][2]))
                                             {
                                                playerWin = true;
                                                break;
                                              }
                                    }
                                    
                                     //verticle win
                                for(int row = 0; row < array.length; ++row)
                                    {
                                              if(array[0][row].equals(array[1][row]) && array[1][row].equals(array[2][row]))
                                                { 
                                                  playerWin = true;
                                                  break;
                                                }
                                    }     

                                   //Diagonal win
                              for(int row = 0; row < array.length; ++row)
                                    {
                                              if(array[0][0].equals(array[1][1]) && array[1][1].equals(array[2][2]))
                                                  {  playerWin = true;
                                                     break;
                                                  }
                                    }      

                                  //Reverse Diagonal
                               for(int row = 0; row < array.length; ++row)
                                    {
                                              if(array[0][2].equals(array[1][1]) && array[1][1].equals(array[2][0]))
                                                  {  playerWin = true;
                                                     break;
                                                  }
                                    }      
                      
                        
                    StringBuilder newNumberArray = new StringBuilder();
                         for(int row = 0; row < array.length; ++row)
                        {
                           for(int col = 0; col < array.length; ++col)
                              {
                                newNumberArray.append(array[row][col] + "  ");
                                count++;

                                if(count == 3)
                                  {
                                    newNumberArray.append("\n");
                                    count = 0;
                                  }
                              }
                         }
                   //Declare Draw
                               if(countPlay == 9 && playerWin == false){
                                  JOptionPane.showMessageDialog(null, "THE GAME IS A DRAW\n" + newNumberArray);
                                  break;
                                }  

                       //Declare winner
                    if(playerWin == true){

                           JOptionPane.showMessageDialog(null, "CONGRATULATIONS!!! YOU WIN!!!\n" + newNumberArray);
                           break;
                         }

                JOptionPane.showMessageDialog(null, "Your move is recorded;\nnow the computer will play\n" + newNumberArray);

             //COMPUTER
               boolean same = false;
               String randomString = "";
                 do{
                      int randomNum = 1 + (int)(Math.random() * 9);
                      randomString = String.valueOf(randomNum);

                      for(int row = 0; row < array.length; row++)
                         {
                             for(int col = 0; col < array[row].length; ++col)
                              {
                                  if(randomString.equals(array[row][col]))
                                      {
                                           array[row][col] = COMP;
                                           same = true;
                                       }
                               }
                         }
                  }while(same != true);
                    
                     countPlay+=1;
                
                 //DETERMINE IF COMPUTER HAS WON
                             boolean compWin = false;
                                        //horizontal win
                              for(int row = 0; row < array.length; ++row)
                                    {
                                         if(array[row][0].equals(array[row][1]) && array[row][1].equals(array[row][2]))
                                             {
                                                compWin = true;
                                                break;
                                              }
                                    }
                                    
                                     //verticle win
                                for(int row = 0; row < array.length; ++row)
                                    {
                                              if(array[0][row].equals(array[1][row]) && array[1][row].equals(array[2][row]))
                                                { 
                                                  compWin = true;
                                                  break;
                                                }
                                    }     

                                   //Diagonal win
                              for(int row = 0; row < array.length; ++row)
                                    {
                                              if(array[0][0].equals(array[1][1]) && array[1][1].equals(array[2][2]))
                                                  {  compWin = true;
                                                     break;
                                                  }
                                    }      

                                  //Reverse Diagonal
                               for(int row = 0; row < array.length; ++row)
                                    {
                                              if(array[0][2].equals(array[1][1]) && array[1][1].equals(array[2][0]))
                                                  {  compWin = true;
                                                     break;
                                                  }
                                    }      
                      
                                    
            StringBuilder newArrayNum = new StringBuilder();
                 for(int row = 0; row < array.length; ++row)
                        {
                           for(int col = 0; col < array.length; ++col)
                              {
                                newArrayNum.append(array[row][col] + "  ");
                                count++;

                                if(count == 3)
                                  {
                                    newArrayNum.append("\n");
                                    count = 0;
                                  }
                              }
                         }

             
                       //Declare winner
                    if(compWin == true){

                           JOptionPane.showMessageDialog(null, "COMPUTER WINS!!!\n" + newArrayNum);
                           break;
                         }
              JOptionPane.showMessageDialog(null, "The computer has played\n" + newArrayNum);

       }while(true);    
     }
}












package wargame;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Noor-E-Maisah Ghannoo
 */
public class Game {
    

   public ArrayList <Player> players;// the players of the game
   
   public static void main(String[] args){
       Game g= new Game();
       Scanner sc = new Scanner(System.in);
       System.out.println("War! ~ The invasion of Cards!");
       Player x = new Player();
       System.out.println("Enter Player number 1 name : ");
       String n1=sc.next();
       System.out.println("Enter Player number 2 name : ");
       String n2=sc.next();
       x.setPlayer1(n1);
       x.setPlayer2(n2);
       x.setPlayerID1((int)((Math.random()+1)*500000));
       x.setPlayerID2((int)((Math.random()+1)*500000));
       System.out.println();
       System.out.println("Welcome to the game: "+x.getPlayer1()+" : "+x.getPlayerID());
       System.out.println("Welcome to the game: "+x.getPlayer2()+" : "+x.getPlayerID2());

       System.out.println();
       System.out.println();
       System.out.println("\t\tRead the following instructiobns carefully\t\t");
       System.out.println("1.This game divides the deck of the 52 cards between two players and then each player throws a random card.");
       System.out.println("2.If the cards are matched, the winning card takes both the cards");
       System.out.println("3.If both the players throw same valued card, then its a WAR!");
       System.out.println("4.The player with maximum cards wins!");
       System.out.println(x);
       sc.close();
       x.play();
       
   }
   
   public Game()
   {
       players = new ArrayList<Player>();
   }

  
   
    /**
    * @return the players of this game
    */
   public ArrayList <Player> getPlayers() 
   {
       return players;
   }

   /**
    * @param players the players of this game
    */
   public void setPlayers(ArrayList <Player> players) 
   {
       this.players = players;
   }
   
   /**
    * Play the game. This might be one method or many method calls depending
    * on your game.
    */
   public void play(){
       
   }
   
   /**
    * When the game is over, use this method to declare and display a winning
    * player.
    */

   public static void declareWinner(){
       
   }
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import java.util.*;

public class TicTacToe {
    
    String page[];
    String game = "run";
    int turn = 1;
    TicTacToe(){
        page = new String[9];
        for(int i=0;i<page.length;i++) page[i] = "_"+(i+1);
        printGame();
    }
    
    void playTheGame(){
        System.out.println("Game starts with player 1 with X");
        int n = 1, block;
        Random rand = new Random();
        while(n<=9){
            if(turn==2){
                block = rand.nextInt(9) + 1;
            }else{
                System.out.println("Player "+turn+" your turn: Select a block\n");
                block = new Scanner(System.in).nextInt();
            }
            if(page[block-1].startsWith("_")){
                if(turn ==1)page[block-1] = "X";
                else{
                    page[block-1] = "0";
                    System.out.println("\nPlayer 2 chose her/his turn");
                }
                int winner = annouceWinner();
                if(winner == 1){
                    System.out.println("Woho player 1 is the winner.");
                    break;
                }else if(winner == 2){
                    System.out.println("Woho player 2 is the winner.");
                    break;
                }
            }else{
                if(n==1) System.out.println("Block already occupied, try again");
                continue;
            }
            if(turn == 1)
                turn = 2;
            else if(turn==2) turn =1;
            printGame();
            System.out.println("");
            n++;
            if(n==10){
                System.out.println("Its a draw");
                break;
            }
        }
    }
    
    
    
    int annouceWinner(){
        String match = "";
        for(int a=1;a<9;a++){
        switch(a){
            case 1: match = page[0]+page[1]+page[2]; 
                    break;
            case 2: match = page[3]+page[4]+page[5];
                    break;
            case 3: match = page[6]+page[7]+page[8];
                    break;
            case 4: match = page[0]+page[3]+page[6];
                    break;
            case 5: match = page[1]+page[4]+page[7];
                    break;
            case 6: match = page[2]+page[5]+page[8];
                    break;
            case 7: match = page[0]+page[4]+page[8];
                    break;
            case 8: match = page[2]+page[4]+page[6];
                    break;
        }
        if(match.equals("XXX")) return 1;
        else if(match.equals("000")) return 2;
        else continue;
        }
        return 0;
    }
    
    void printGame(){
        System.out.println(page[0]+" | "+page[1]+" | "+page[2]);
        System.out.println(page[3]+" | "+page[4]+" | "+page[5]);
        System.out.println(page[6]+" | "+page[7]+" | "+page[8]);
    }
    
    public static void main(String[] args) {
        
        TicTacToe obj = new TicTacToe();
        obj.playTheGame();
        
    }
    
}

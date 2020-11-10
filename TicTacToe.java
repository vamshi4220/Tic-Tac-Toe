import java.util.*;

public class TicTacToe {

	public static char[] Board=new char[10];

	public static void main (String[] args) {

                creatBoard();
		userChoice();

	}

 //UC1

        public static void creatBoard() {

		 for(int index=1; index<Board.length; index++) {
                        Board[index]=' ';
                 }

         }

//UC2

        public static void userChoice(){

        System.out.println("Enter 1 for 'X' or 2 for 'O':");
        int choice=sc.nextInt();

                if(choice == 1){

                         PlayerChoice[0]='X';
                         PlayerChoice[1]='O';

                }

                else if(choice == 2){

                          PlayerChoice[0]='O';
                          PlayerChoice[1]='X';

                }

                else  {

                        System.out.println("wrong input");
                        userChoice();

                }

        }


   }

import java.util.*;

public class TicTacToe {

	public static char[] Board=new char[10];

	public static void main (String[] args) {

                creatBoard();


	}

 //UC1

        public static void creatBoard() {

		 for(int index=1; index<Board.length; index++) {
                        Board[index]=' ';
                 }


         }

   }

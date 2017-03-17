import java.io.*;
import java.util.*;

public class Maze{

	private String[] textmaze;
		
	private int startRow;

	private int startCol;
		
	private int finishRow;		

	private int finishCol;

	private int[][] theMaze;
	
	private MazeLocationListRefBased theList = new MazeLocationListRefBased();
	
	private MazeLocation start;
	
	private MazeLocation finish;
	

	public Maze(String[] textmaze, int startRow, int startCol, int finishRow, int finishCol){
		this.textmaze = textmaze;
		this.startRow = startRow;
		this.startCol = startCol;
		this.finishRow = finishRow; 
		this.finishCol = finishCol;
		
		//int: 1(block), 0(empty);
		//firstly, change the string of textmaze into a two dimension int matrix
		
		theMaze = new int[textmaze.length][textmaze[0].length()];//create a maze that is in the type of int
		for(int i = 0; i < textmaze.length; i++){
			for(int j = 0; j < textmaze[0].length(); j++){
		 	theMaze[i][j] = textmaze[i].charAt(j);//copy maze into the new int maze
			if(textmaze[i].charAt(j) == '*'){
				theMaze[i][j] = 0;
			}
			else
				theMaze[i][j] = 1;
			}	
		}
		
		for(int i = 0; i < textmaze.length; i++){//this will print out the maze in string type
			System.out.println(textmaze[i]);
		}
	}
	
	
	/** this function solves mazes as provided in files
	@Return object represents linked list of the solved path
	*/
	public MazeLocationList solve(){
		start = new MazeLocation(startRow, startCol);
		finish = new MazeLocation(finishRow, finishCol);
		if(findPath(start.row, start.column, finish.row, finish.column)){
			return theList;
		}
		else{
			return null;
		}
	}
	
	private boolean findPath(int fromRow, int fromCol, int toRow, int toCol){//recursion to find the path here
		//need code to check the size and wall; fromRow && fromCol > size
		MazeLocation temp = new MazeLocation(fromRow, fromCol); 
		theList.insertTail(temp);
		
		theMaze[fromRow][fromCol] = 0;
		if(fromRow == toRow && fromCol == toCol){//the base case for the recursion
			return true;
		}
		
		//recursive calls here
		boolean ans;
		//going down
		if(fromRow + 1< textmaze.length && theMaze[fromRow + 1][fromCol] == 1){
			if(findPath(fromRow + 1, fromCol, toRow, toCol)){
				return true;
			}
		}
		
		//three other directions here
		//going left		
		if(fromCol - 1 >= 0 && theMaze[fromRow][fromCol -1] == 1){
			if(findPath(fromRow, fromCol - 1, toRow, toCol)){
				return true;
			}
		}
		
		//going right
		if(fromCol  + 1 < textmaze[0].length() && theMaze[fromRow][fromCol +1] == 1){
			if(findPath(fromRow, fromCol + 1, toRow, toCol)){
				return true;
			}
		}
		
		//going up
		if(fromRow - 1 >= 0 && theMaze[fromRow - 1][fromCol] == 1){
			if(findPath(fromRow - 1, fromCol, toRow, toCol)){
				return true;
			}
		}	
		
		theList.removeTail();//remove the tail if there is no way out
		return false;//base failure case for there is no way out for the maze
	}
	
	public String toString(){
		//StringBuilder s = new StringBuilder(numRow *(numCols + 1));//probably not numRow and numCols
		//only for string, which I dont use
		for(int i = 0; i < theMaze.length; i++){
			for(int j = 0; j < theMaze[0].length; j++){
				if(theMaze[i][j] == 1){
					System.out.print("*");	//just for illustration
					//if it is a string(which i dont use), the above line can write as s.append("q");
				}
				else{
				System.out.print(" ");	//just for illustration
				//if it is a string(which i dont use), the above line can write as s.append("p");
				}
			}
			System.out.println();	
			//s.append("\n");
		}
		return null;
		//return new String(s);
	}
}
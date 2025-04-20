package main.java.dp.onedimentional;

import java.util.Arrays;

/*There are a row of N houses,Each house can be painted with one of 
the three colores:red,blue or green. The cost of painting each house
 with a certain color is different. You have to paint all the houses 
 such that no two adjacent houses have the same color.what is the minimum Cost.
*/
public class NHousePainting {

	public static final int RED=0,BLUE=1,GREEN=2;
	
	public static void main(String args[]){
		int [][]cost={{17,2,17},{16,16,5}, {14,3,9}};
		System.out.println("Min cost  "+minCost(cost));
		
		int cost1 = calcHouseColoringCost(cost);
		  System.out.println("Cost of coloring the house is: " + cost1);
	}
	
	public static int minCost(int[][] cost,int i,int color){
		if(i==cost.length)
			return 0;
		switch(color){
		case RED:{
			int costBlue=minCost(cost,i+1,BLUE);
			int costGreen=minCost(cost,i+1,GREEN);
			return cost[i][RED]+Math.min(costBlue, costGreen);
		}
		case BLUE:{
			int costRed=minCost(cost,i+1,RED);
			int costGreen=minCost(cost,i+1,GREEN);
			return cost[i][BLUE]+Math.min(costRed, costGreen);
		}
		case GREEN:{
			int costRed=minCost(cost,i+1,RED);
			int costBlue=minCost(cost,i+1,BLUE);
			return cost[i][GREEN]+Math.min(costBlue, costRed);
		}
		
		}
		return 0;
	}
	
	public static int minCost(int[][] cost){
		int costRed=minCost(cost,0,RED);
		int costBlue=minCost(cost,0,BLUE);
		int costGreen=minCost(cost,0,GREEN);
		return Math.min(costRed,Math.min(costGreen, costBlue));
	}
	
	//Same probelem with memoization:
	public static int minCostMemo(int[][] cost,int i,int color,int[][] cache){
		if(i==cost.length)
			return 0;
		if(cache[i][color]!=-1){
			return cache[i][color];
		}
		switch(color){
		case RED:{
			int costBlue=minCostMemo(cost,i,BLUE,cache);
			int costGreen=minCostMemo(cost,i,GREEN,cache);
			return cache[i][color]=cost[i][RED]+Math.min(costGreen, costBlue);
			
		}
		
		case GREEN:{
			int costRed=minCostMemo(cost,i,RED,cache);
			int costBlue=minCostMemo(cost,i,BLUE,cache);
			return cache[i][color]=cost[i][GREEN]+Math.min(costRed, costBlue);
			}
		
		case BLUE:{
			int costRed=minCostMemo(cost,i,RED,cache);
			int costGreen=minCostMemo(cost,i,GREEN,cache);
			return cache[i][color]=cost[i][BLUE]+Math.min(costGreen, costRed);
			
		}
		}
		return 0;
		
	}
	
	public static int minCostMemo(int[][] cost){
		int[][] cache=new int[cost.length][cost[0].length];
		for(int[] row:cache){
			Arrays.fill(row,-1);
		}
		int costRed=minCostMemo(cost,0,RED,cache);
		int costGreen=minCostMemo(cost,0,GREEN,cache);
		int costBlue=minCostMemo(cost,0,BLUE,cache);
		
		return Math.min(costRed, Math.min(costGreen, costBlue));
	}
	
	//Second solution for whole matrix:
	
	 public static int calcHouseColoringCost(int [][] M) {
		  int finalCost = 0;
		  int r = M.length+1;
		  int c = M[0].length;
		  int [][] C = new int[r][c];
		   
		  for (int i=0; i<c; i++) {
		   C[0][i] = 0;
		  }
		   
		  for (int i=1; i<r; i++) {
		   C[i][0] = Math.min(C[i-1][1], C[i-1][2]) + M[i-1][0];
		   C[i][1] = Math.min(C[i-1][2], C[i-1][0]) + M[i-1][1];
		   C[i][2] = Math.min(C[i-1][0], C[i-1][1]) + M[i-1][2];
		  }
		  //System.out.println(C[r-1][0]);
		  //System.out.println(C[r-1][1]);
		  //System.out.println(C[r-1][2]);
		  finalCost = Math.min(Math.min(C[r-1][0], C[r-1][1]), C[r-1][2]);
		  //printing the DP matrix.
		  System.out.println("Cost matrix leading to the solution: ");
		  printMatrix(C);
		  return finalCost;
		 }
		  
		 public static void printMatrix(int [][]M) {
		  int r = M.length;
		  int c = M[0].length;
		   
		  for (int i=0; i<r; i++) {
		   for (int j=0; j<c; j++) {
		    System.out.print(M[i][j] + " ");
		   }
		   System.out.println();
		  }
		 }
	
	
}

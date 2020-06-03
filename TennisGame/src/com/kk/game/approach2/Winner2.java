package com.kk.game.approach2;

public class Winner2 {

	// This inputs a nxn matrix of player winning

	static int n = 3; // initially considering N = 3

	// So the players match result can be shown in this NxN matrix.

	static int[][] winningScore = { 
			{ 0, 1, 1 }, 
			{ 0, 0, 0 }, 
			{ 0, 1, 0 } };

//	static int[][] winningScore = {
//			 {0, 0, 1, 1, 1, 0, 1},
//			 {1, 0, 1, 1, 1, 1, 1},
//			 {0, 0, 0, 1, 1, 0, 0},
//			 {0, 0, 0, 0, 1, 0, 0},
//			 {0, 0, 0, 0, 0, 0, 0},
//			 {1, 0, 1, 1, 1, 0, 1},
//			 {0, 0, 1, 1, 1, 0, 0}
//			 };

	public static void main(String[] args) {

		// finding winner
		int winner = 0;

		for (int i = 1; i < n; i++) {
			if (winningScore[i][winner] == 1)
				winner = i;
		}

		System.out.println("Winning Player = "+winner);

		int[] rank = { 0, 1, 2 };

		CustomSort.sort(rank, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.println("Player with Rank "+(i+1)+" = "+rank[i]);
		}

	}

}

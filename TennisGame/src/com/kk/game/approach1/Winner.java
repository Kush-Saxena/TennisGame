package com.kk.game.approach1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Winner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Player> players = new ArrayList<Player>();

		int n = 10; // Hard coding Players data for 10 players

		players.add(new Player("aa", 30));
		players.add(new Player("bb", 10));
		players.add(new Player("cc", 25));
		players.add(new Player("dd", 14));
		players.add(new Player("ee", 16));
		players.add(new Player("ff", 18));
		players.add(new Player("gg", 35));
		players.add(new Player("hh", 24));
		players.add(new Player("ii", 28));
		players.add(new Player("jj", 63));

//		System.out.println("Enter number of players: ");
//		int n = sc.nextInt();
//		System.out.println("Enter Player Details: ");
//		for (int i = 1; i <= n; i++) {
//
//			System.out.println("Player " + i + " Name: ");
//			sc.nextLine();
//			String tempName = sc.nextLine();
//			System.out.println("Player " + i + " Skill: ");
//			int tempSkill = sc.nextInt();
//			players.add(new Player(tempName, tempSkill));
//
//		}

		// Input done

		// Finding Winner
		Player winner = players.get(0); // by default considering first player as winner.
		for (int i = 1; i < players.size(); i++) {
			Player thisPlayer = players.get(i);
			if (thisPlayer.getSkill() > winner.getSkill()) {
				winner = thisPlayer;
			}
		}

		System.out.println("Winner : " + winner);

		// Finding Ranks

		// Using simple Sorting by custom comparator
		Collections.sort(players, new PlayerComparator1());

		// printing the list according to order

		int rank = n;
		for (Player p : players) {

			System.out.println("Player with rank " + rank + " = " + p);
			rank--;
		}

		sc.close();
	}
}

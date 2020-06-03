package com.kk.game.approach1;

import java.util.Comparator;

public class PlayerComparator1 implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		
		return (o1.getSkill() - o2.getSkill());
		
		
	}

}

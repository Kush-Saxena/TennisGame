package com.kk.game.approach1;

public class Player {

	private String name;
	private int skill;

	Player(String name, int skill) {
		this.name = name;
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", skill=" + skill + "]";
	}

	public int getSkill() {
		return skill;
	}

}

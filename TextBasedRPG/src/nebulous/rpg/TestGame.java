package nebulous.rpg;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.Color.*;

public class TestGame {

	public Player player;
	
	public TestGame() {
		preGame();
//		runGame();
	}
	
	public void preGame() {
		
		AnsiConsole.systemInstall();
		
		player = new Player();
		
		Console.println(YELLOW, "----------------------------------------------");
		Console.println(YELLOW, true, " WELCOME TO THE GAME!");
		Console.println(YELLOW, "----------------------------------------------");
		
//		player.setName(Console.readLine("> Choose your name: "));
//		Console.command("cls");
//		Console.println("\n > Welcome to the game " + player.getName() + "! What race are you ?\n");
//		
//		player.setCharacterRace(promtRaceSelection());
//		Console.command("cls");
//		Console.println("\n > Great! So you are a " + player.getCharacterRace() + " are you? Now what class are you?\n");
		
		player.setCharacterClass(promtClassSelection());
		Console.command("cls");
		Console.println(BLUE, "\n > Ahhh, You are a " + player.getCharacterClass() + "! Lets refine your character a bit more with some stats!\n");
	}
	
	public void runGame() {
		
		while(true) {
			Console.println(WHITE, "A thing happens...");
			String response = Console.readLine(WHITE, "Response: ");
			Console.println(WHITE, "You chose " + response);
		}
		
	}
	
	public CharacterRace promtRaceSelection() {
		
		Console.println(YELLOW, "----------------------------------------------");
		Console.println(YELLOW, "Available races:\n HUMAN, ELF, DWARF, HALFLING");
		Console.println(YELLOW, "----------------------------------------------");
		
		String sRace = Console.readLine(BLUE, " > Choose a race: ");
		
		switch (sRace.toUpperCase()) {
		case "HUMAN":
			return CharacterRace.HUMAN;
		case "ELF":
			return CharacterRace.ELF;
		case "DWARF":
			return CharacterRace.DWARF;
		case "HALFLING":
			return CharacterRace.HALFLING;
		default:
			Console.println(RED, " > Sorry, but that race does not exist in this kingdom. Choose another:");
			return promtRaceSelection();
		}
	}
	
	public CharacterClass promtClassSelection() {
		
		Console.println(YELLOW, "----------------------------------------------");
		Console.println(YELLOW, "Available classes: \n"
				+ " FIGHTER:\n"
				+ "    FIGHTER'S MIGHT        = +4 ATTACK\n"
				+ "    FIGHTER'S VITALITY     = +2 HEALTH\n"
				+ " BARBARIAN:\n"
				+ "    BARBARIAN'S MIGHT      = +2 ATTACK\n"
				+ "    BARBARIAN'S VITALITY   = +4 HEALTH\n"
				+ " CLERIC:\n"
				+ " PALADIN, ROGUE, WIZARD");
		Console.println(YELLOW, "----------------------------------------------");
		
		String sRace = Console.readLine(BLUE, " > Choose a class: ");
		
		switch (sRace.toUpperCase()) {
		case "FIGHTER":
			return CharacterClass.FIGHTER;
		case "BARBARIAN":
			return CharacterClass.BARBARIAN;
		case "CLERIC":
			return CharacterClass.CLERIC;
		case "PALADIN":
			return CharacterClass.PALADIN;
		case "ROGUE":
			return CharacterClass.ROGUE;
		case "WIZARD":
			return CharacterClass.WIZARD;
		default:
			Console.println(RED, " > Sorry, but that class does not exist in this kingdom. Choose another:");
			return promtClassSelection();
		}
	}
	
	public static void main(String[] args) {
		new TestGame();
	}

}

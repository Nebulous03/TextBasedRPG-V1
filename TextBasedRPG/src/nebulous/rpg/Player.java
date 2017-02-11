package nebulous.rpg;

public class Player {
	
	// -------------------------------
	// 			   NAME
	// -------------------------------
	
	private String NAME = "default";
	
	// -------------------------------
	//			 FEATURES
	// -------------------------------
	
	private CharacterRace  RACE	 = CharacterRace.HUMAN;
	private CharacterClass CLASS = CharacterClass.FIGHTER;
	
	// -------------------------------
	// 			PLAYER STATS
	// -------------------------------
	
	private short STR = 0;
	private short DEX = 0;
	private short INT = 0;
	private short CHA = 0;
	private short LCK = 0;
	
	// -------------------------------
	//		   GETTER/SETTER
	// -------------------------------
	
	public String getName() {
		return NAME;
	}
	public void setName(String name) {
		NAME = name;
	}
	public CharacterRace getCharacterRace() {
		return RACE;
	}
	public void setCharacterRace(CharacterRace characterRace) {
		RACE = characterRace;
	}
	public CharacterClass getCharacterClass() {
		return CLASS;
	}
	public void setCharacterClass(CharacterClass characterClass) {
		CLASS = characterClass;
	}
	public short getStrength() {
		return STR;
	}
	public void setStrength(short strength) {
		STR = strength;
	}
	public short getDexterity() {
		return DEX;
	}
	public void setDexterity(short dexterity) {
		DEX = dexterity;
	}
	public short getIntelligence() {
		return INT;
	}
	public void setIntelligence(short intelligence) {
		INT = intelligence;
	}
	public short getCharisma() {
		return CHA;
	}
	public void setCharisma(short charisma) {
		CHA = charisma;
	}
	public short getLuck() {
		return LCK;
	}
	public void setLuck(short luck) {
		LCK = luck;
	}
	
}

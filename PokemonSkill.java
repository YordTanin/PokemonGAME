
public class PokemonSkill{
	private String name;
	private int damage;

	public PokemonSkill(String name, int damage){
		this.name = name;
		this.damage = damage;
	}

	public String getName(){
		return this.name;
	}

	public float getDamage(){
		return this.damage;
	}

	public static PokemonSkill getPokemonSkill(String name){
		PokemonSkill skill = null;
		switch(name.toLowerCase()){
			case "Grass Knot":
				skill = new PokemonSkill("Grass Knot", 75);
				break;
			case "Energy Ball":
				skill = new PokemonSkill("Energy Ball", 110);
				break;
			case "Acrobatics":
				skill = new PokemonSkill("Acrobatics", 55);
				break;
			case "Spit Fire":
				skill = new PokemonSkill("Spit Fire", 105);
				break;
                        case "Water Gun":
				skill = new PokemonSkill("Water Gun", 65);
				break;
			case "Hydro Pump":
				skill = new PokemonSkill("Hydro Pump", 100);
				break;        
		}
		return skill;
	}
}

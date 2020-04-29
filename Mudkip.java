
public class Mudkip extends Pokemon implements Runnable{
	private static final int maxGroupHealth = 500;
	public Mudkip(){
		super("Mudkip",
		      (int) Math.floor(Math.random() * 501)+ 100,(int) Math.floor(Math.random() * 21) + 40);

		this.attackSkill = PokemonSkill.getPokemonSkill("Water Gun");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Hydro Pump");
	}

	public void move(){
		this.run();
	} 

	public void run(){
		this.reducedWeight(1);
	}

	public void walk(){
		this.reducedHealth(1);
	}

}

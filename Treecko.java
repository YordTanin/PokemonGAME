
public class Treecko extends Pokemon implements Runnable{
	private static final int maxGroupHealth = 500;
	public Treecko(){
		super("Treecko",
		      (int) Math.floor(Math.random() * 501)+ 100,(int) Math.floor(Math.random() * 21) + 40);

		this.attackSkill = PokemonSkill.getPokemonSkill("Grass Knot");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Energy Ball");
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

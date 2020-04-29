public class Torchic extends Pokemon implements Runnable{
	private static final int maxGroupHealth = 500;
	public Torchic(){
		super("Torchic",
		      (int) Math.floor(Math.random() * 501)+ 100,(int) Math.floor(Math.random() * 21) + 40);

		this.attackSkill = PokemonSkill.getPokemonSkill("Acrobatics");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Spit Fire");
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

package world;

public class Field {
	private Plant plant = new Plant();
	public Field(){
		// size is protected, field is in same package as plant
		System.out.println(plant.size);
	}
}

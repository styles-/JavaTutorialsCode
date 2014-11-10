
public class PolymorphismTutorial {
	public static void main(String[] args){
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		
		plant2.grow();
		
		tree.shedLeaves();
		
		// type of variable/reference matters, plant2 isn't a tree
		// determines the methods you can use
		// however, when you call the method, it's the physical object that runs relevant code
		// plant2.shedLeaves();
		
		doGrow(tree);
	}
	
	public static void doGrow(Plant plant){
		plant.grow();
	}
}

package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
	World zaWardu = new World();
	Location strength = new Location (4,5);
	
	
	Flower straycat = new Flower ();
	Location superfly = new Location (5,3);
	zaWardu.add(superfly, straycat);
	for (int i = 0; i < 10 ; i++) {
		
		for (int j = 0; j < 10; j++) {
			Location hierophantGreen = new Location(i,j);
			zaWardu.add(hierophantGreen, straycat);
			
		}Bug ebonydevil = new Bug();
	zaWardu.add(strength, ebonydevil);
	ebonydevil.turn();
	}
	
	zaWardu.show();
	}

}

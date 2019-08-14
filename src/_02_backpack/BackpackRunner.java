package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		
		Backpack drake = new Backpack();
		Pencil lilnas = new Pencil ();
		Ruler sixnine = new Ruler ();
		Textbook kodakb = new Textbook ();
		drake.putInBackpack(lilnas);
		drake.putInBackpack(sixnine);
		drake.putInBackpack(kodakb);
		drake.goToSchool();
	}
}

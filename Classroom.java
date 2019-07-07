package wildcodeschool.java06;

public class Classroom {
	
		
			
			public static void main(String[] args) {
			
			boolean awareYes=true;
			                                                     //Instance de Wilders / les testeurs
			Wilder Sandrine = new Wilder("Sandrine",awareYes);
			Wilder Julien = new Wilder("Julien",awareYes);
			Wilder Jorys = new Wilder("Jorys",awareYes);
			Wilder Marilou = new Wilder("Marilou",awareYes);
			Wilder Mariehelene = new Wilder("Mariehelene",!awareYes);
			
			
			System.out.println(Sandrine.whoAmI());	
			System.out.println(Mariehelene.whoAmI());
			System.out.println(Marilou.whoAmI());
			System.out.println(Julien.whoAmI());
			System.out.println(Jorys.whoAmI());
			

	}

}

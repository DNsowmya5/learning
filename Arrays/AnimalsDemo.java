package Arrays;

public abstract class AnimalsDemo {
		abstract void cats();

		abstract void dogs();

	}

	class Cats extends AnimalsDemo{

		public void cats(){

			System.out.println("Cat's Meow ");

		}
	public void dogs(){}

	}
	class Dogs extends AnimalsDemo{

		public void cats(){
		}

		public void dogs(){

			System.out.println("Dogs bark ");
		}
	}


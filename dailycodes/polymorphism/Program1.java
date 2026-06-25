import java.util.*;

class Shape{
	void draw(){
		System.out.println("Draw Shape");
	};
	void erase(){
		System.out.println("Erase Shape");
	};
}

class Circle extends Shape{
	@Override
	void draw(){
		System.out.println("Draw Circle");
	};

	@Override
	void erase(){
		System.out.println("Erase Circle");
	};
}

class Square extends Shape{
	@Override
	void draw(){
		System.out.println("Draw Square");
	};

	@Override
	void erase(){
		System.out.println("Erase Square");
	};
}

class Triangle extends Shape{
	@Override
	void draw(){
		System.out.println("Draw Triangle");
	};

	@Override
	void erase(){
		System.out.println("Erase Triangle");
	};
}

class RandomGeneratorShape{
	Random random=new Random();

	/*
	 * public Circle getCircle(){return new Circle();}
	 * public Square getSquare(){return new Square();}
	 * public Triangle getTriangle(){return new Triangle();}
	 * public Shape getShape(){return new Shape();}
	 */

	public Shape getShape(){
		int val=random.nextInt(3);

		switch(val){
			case 0:return new Circle();
			case 1:return new Square();
			case 2:return new Triangle();
			case 3:return new Shape();
		}
		return null;
	}
}

class Client{
	public static void main(String[]args){
		RandomGeneratorShape genShape=new RandomGeneratorShape();

		Shape shape=genShape.getShape();
		
	}
}

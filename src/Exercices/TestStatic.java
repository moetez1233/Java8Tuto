package Exercices;

public class TestStatic {
	public Integer x=1;
	public static Integer y =1;
	public TestStatic() {
		super();
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public static Integer getY() {
		return y;
	}
	public static void setY(Integer y) {
		TestStatic.y = y;
	}
	
}

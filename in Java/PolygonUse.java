import java.util.Scanner;
interface RegularPolygon{
	int getNumSide();
	float getSideLength();
}
class EquilateralTriangle implements RegularPolygon{
	float length;
	EquilateralTriangle(float len){
		this.length=len;
	}
	public int getNumSide(){
		return 3;
	}
	public float getSideLength() {
		return length;
	}
}
class Square implements RegularPolygon{
	float length;
	Square(float len){
		this.length=len;
	}
	public int getNumSide(){
		return 4;
	}
	public float getSideLength() {
		return length;
	}
}
public class PolygonUse {
	static int total=0;
	public static void totalSides(int c) {
		if(c==1) {
			total+=3;
		}
		else {
			total+=4;
		}
	}
	public static float getPerimeter(int sides, float length){
		return sides*length;
	}
	public static void Display(RegularPolygon rp){
		System.out.println("Total no of sides of the polygon are: "+ rp.getNumSide());
		System.out.println("Length of each side of the polygon is: "+rp.getSideLength());
		System.out.println("The Perimeter of the polygon is: "+ getPerimeter(rp.getNumSide(),rp.getSideLength()));
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ch;
		int cont;
		float length;
		do {
			System.out.print("Enter the length of side of the polygon: ");
			length=sc.nextFloat();
			System.out.println("Main Menu.");
			System.out.println("1.Triangle");
			System.out.println("2.Square.");
			System.out.print("Enter Your Choice: ");
			ch=sc.nextInt();
			if(ch==1) {
				EquilateralTriangle et = new EquilateralTriangle(length);
				totalSides(ch);
				Display(et);
			}
			else if(ch==2) {
				Square sq = new Square(length);
				totalSides(ch);
				Display(sq);
			}
			else {
				System.out.println("Invalid Choice.");
			}
			System.out.print("Do You Want To Continue (1-Yes/0-No)?");
			cont=sc.nextInt();
		}while(cont!=0);
		System.out.print("The total no of sides is" + total);
		sc.close();
	}
}

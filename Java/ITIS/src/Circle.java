
public class Circle {
 private int x,y;
//add default constructor
//public Circle(){
//	this.x=0;
//	this.y=0;
//}
 public Circle(int x, int y){
	 this.x=x;
	 this.y=y;
 }
 
 private void calc(){
	 System.out.println("blue");
 }
 public String colour(){
	 calc();
	 return "";
 }

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}
	 




}

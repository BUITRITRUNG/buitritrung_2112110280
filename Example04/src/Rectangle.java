
public class Rectangle {
	int width;
	int height;
	public Rectangle(int a,int b){
		width= a;
		height=b;
	}
	public int area(){
		return(width*height);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle recta=new Rectangle(3,4);
		Rectangle rectb=new Rectangle(5,6);
		System.out.println("rect a:"+recta.area());
		System.out.println("rect b:"+rectb.area());
	}

}

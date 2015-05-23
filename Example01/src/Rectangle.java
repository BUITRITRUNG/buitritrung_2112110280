
public class Rectangle {
	int x;
	int y;
	public void setValues(int a,int b){
		x=a;
		y=b;
	}

	public int area(){
		return(x*y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle rect =new Rectangle();
Rectangle rectb =new Rectangle();
rect.setValues(3, 4);
rectb.setValues(5, 6);
System.out.println("rect a:"+rect.area());
System.out.println("rect b:" + rectb.area());

	}

}


public class Animation2D extends Animation implements Drawable{

	
	
	public static void main(String[] args) {
		Animation2D a = new Animation2D();
		a.draw();
		int b =0;
		b=a.getFramerate();
		System.out.println(b);
		}
	public void draw() {
	
	System.out.println("drawing");
	}
	
	public int getFramerate(){
		int i=24;
		return i;
	}
	
}

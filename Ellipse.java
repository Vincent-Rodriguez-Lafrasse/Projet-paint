import java.awt.*;

public class Ellipse extends figure{ //devient la fille de la classe figure
	int length=0;
	int  width=0;
	
	public Ellipse (int px, int py, Color c){ 
		super(c,new point(px,py));
	}
	
	public void draw (Graphics g){
		}
	@Override public void setBoundingBox (int heightBB, int widthBB){
		this.length=heightBB;
		this.width=widthBB;
		}
	
}

import java.awt.*;

public class circle extends Ellipse{ 
	int length=0;
	int  width=0;
	public circle (int px, int py, Color c){
	super(px,py,c);
	}
	public void draw (Graphics g){
	}
	@Override public void setBoundingBox (int heightBB, int widthBB){
		int m=Math.min(heightBB,widthBB);
		this.length=m;
		this.width=m;
	
	}
	
}


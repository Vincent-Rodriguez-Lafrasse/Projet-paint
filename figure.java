import java.awt.Color;
import java.awt.Graphics;

public abstract class figure{
		private Color c;
		private point p;
		@Override public String toString(){
			return "color: " + this.c + "; point: " + this.p ;
			}
		
		public figure(Color c, point p){
			this.c = c;
			this.p = p;
			}	
			
		public Color getcolor() {
			return c;
			}
			
		public point getpoint() {
			return p;
			}
		
		public abstract void setBoundingBox (int heightBB, int widthBB);
		public abstract void draw (Graphics g);

}



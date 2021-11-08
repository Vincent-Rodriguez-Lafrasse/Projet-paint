public class point{
		private int X;
		private int Y;
		
		public point(){	}
		
		public point(int X, int Y){
			this.X = X;
			this.Y = Y;
			}	
		
		@Override public String toString(){
			return "(" + this.X + ";" + this.Y + ")  ";
			}
	
			
		public int getX() {
			return X;
			}
		public void setX(int X) {
			this.X = X;
			}
		public int getY() {
			return Y;
			}
		public void setY(int Y) {
			this.Y= Y;
			}
			
}

//setbouding box c'est simple,
//on le fait surtout pour la forme pour rectangle, ilest plus tuile pour carré et cercle voir code moodle

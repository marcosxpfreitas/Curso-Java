package classesearrays;

public class Ponto {
	public double x = 0.0;
	public double y = 0.0;

	
	public Ponto(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	public void descolar(double deltaX, double deltaY){
		this.x += deltaX;
		this.y += deltaY;
	}
	public void zerar (){
		x=0;
		y=0;
	}
	public boolean isMenorQueZero(){
		if (y<0){
			return true;
		}
		return false;
	}

}

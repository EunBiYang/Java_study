package practice;
public class Area {
  private double base;
  private double height;
  
  public Area() {
	  super();
  }
  
  public void setArea(double base,double height) {
     this.base =base;
     this.height=height;
  }

public double getBase() {
   return base;
}

public void setBase(double base) {
   this.base = base;
}

public double getHeight() {
   return height;
}

public void setHeight(double height) {
   this.height = height;
}
}
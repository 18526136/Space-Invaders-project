public class DefaultCritter implements Critter {
  
  protected double x;
  protected double y;
  protected double theta;
  protected double deg = 5;
  private double min_angle=-90;
  private double max_angle=90;
  protected double min_x=0.05;
  protected double max_x=0.95;
  protected double max_y=0.05;
  protected double dx;
  protected double dy;
  protected int score;
  
  public DefaultCritter(double dx, double dy, double x, double y, double theta, int score){
    this.dx = dx;
    this.dy = dy;
    this.x = x;
    this.y = y;
    this.theta = theta;
    this.score = score;
  }
  
  public void set_VelocityX(double velocityx){
    dx = velocityx;}
  
  public void set_VelocityY(double velocityy){
    dy = velocityy;}
  
  
  public double get_theta(){
    return theta;}
  
    public double get_score(){
    return score;}
    
      public void set_score(int num){
    score=num;
      }
  
  public void set_x(double posx){
    x = posx;}
  
  public void set_y(double posy){
    y = posy;}
  public double get_x(){
    return x;}
  
  public double get_y(){
    return y;}
  
  
  public void set_theta(double theta){
    this.theta = theta;
    if (theta < min_angle){
      this.theta = min_angle;
    }
    if (theta > max_angle){
      this.theta = max_angle;
    }
  }
  
  public void rotate_anti(){
    theta = theta + deg;
    if (theta > max_angle){
      theta = max_angle;
    }
  }
  
  public void rotate_clock(){
    theta = theta - deg;//+
     if (theta < min_angle){
      theta = min_angle;
    }
  }
  
  public void move_left(){
    x -= dx;
    if (x < min_x){
      x = min_x;
    }
  }
  
  public void move_right(){
    x += dx;
    if (x > max_x){
      x = max_x;
    }
  }
  public void move_up(){
    while(y>max_y){
      y -= dy;
      if(y<max_y){
        y = max_y;
      }
    }
  }
}



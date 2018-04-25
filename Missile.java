public class Missile extends DefaultCritter{

  public Missile(double vx, double vy, double x, double y,double theta){ //the missile has the same initial direction and position as the shooter
    super(vx, vy ,x, y, theta);
  }
  
  public void touching_wall(){ //if the bullet touches the wall, invert the velocity
    vx = -vx;
    vy = -vy;
  }

  public void move(){
    y = y + vy;
    x = x + vx;
    draw();
  }
  public void move1(){
    y = y + vy;
    x = x + vx;
    draw1();
  }
  public void move2(){
    y = y + vy;
    x = x + vx;
    draw2();
  }
    public void move_enemy_missile(){
    y = y + vy;
    draw_enemy_missile();
  }
  
  public void draw(){
    StdDraw.picture(x, y, "laser.png", 0.1, 0.1, theta);
  }
  
  public void draw1(){
    StdDraw.setPenColor(StdDraw.WHITE);
    StdDraw.filledCircle(x, y, 0.01);
  }
  
  public void draw2(){
    
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.filledCircle(x, y, 0.01);
  }
  public void draw_enemy_missile(){
    StdDraw.picture(x, y, "enemy_draw.png", 0.05, 0.05, theta);
  }
}
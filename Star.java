import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
{
    private int x, y, speed, size;
    private Color color;
    
    public Star(int speed, Color color, int worldWidth, int worldHeight)
    {
      size = 1 + Greenfoot.getRandomNumber(4);
      GreenfootImage image = new GreenfootImage (size, size);
      image.setColor (color);
      image.fillOval (0, 0, size, size); 
      setImage(image);
      this.speed = speed;
      
      x = Greenfoot.getRandomNumber(worldWidth);
      y = Greenfoot.getRandomNumber(worldHeight);
    
   }

   public void move()
   {
       x = speed + x;
       setLocation(x + speed, y);
       if(x < 1)
       {
          x = getWorld().getWidth();
       }
       
   }
       public int getX()
    {
        return y;
    }
    public int getY()
    {
        return y;
    }
}


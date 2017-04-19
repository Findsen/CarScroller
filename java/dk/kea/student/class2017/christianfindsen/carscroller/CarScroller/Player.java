package dk.kea.student.class2017.christianfindsen.carscroller.CarScroller;

/**
 * Created by Christian Findsen on 19-04-2017.
 */

public class Player
{

    public static final int WIDTH = 49;
    public static final int HEIGHT = 90;
    public int x;
    public int y;
    public int spritex = 0;
    public int spritey = 0;


    //contruktor
    public Player (int x, int y)
    {
        this.x = x;
        this.y = y;
    }

}
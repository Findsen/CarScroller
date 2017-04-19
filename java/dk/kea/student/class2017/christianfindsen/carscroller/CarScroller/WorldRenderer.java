package dk.kea.student.class2017.christianfindsen.carscroller.CarScroller;

import android.graphics.Bitmap;

import dk.kea.student.class2017.christianfindsen.carscroller.GameEngine;

/**
 * Created by Christian Findsen on 17-04-2017.
 */

public class WorldRenderer
{
    GameEngine game;
    World world;
    Bitmap scrBackImage;
    Bitmap carImage;
    Bitmap monsterImage;
    int screenWidth;
    int screenHeight;
    Bitmap playerImage;

    public WorldRenderer(GameEngine game, World world)
    {
        this.game = game;
        this.world = world;
        screenWidth = game.getFrameBufferWidth();
        screenHeight = game.getFrameBufferHeight();
        scrBackImage = game.loadBitmap("xcarbackground.png");
        carImage = game.loadBitmap("xbluecar2.png");
        monsterImage = game.loadBitmap("xyellowmonster.png");
        playerImage = game.loadBitmap("xrunningalien.png");
    }

    public void render()
    {
        game.drawBitmap(scrBackImage,
                0,0,
                (int)world.scrollingBackground.scrollx, 0,
                screenWidth, screenHeight);
        game.drawBitmap(playerImage, world.player.x, world.player.y,
                world.player.spritex, world.player.spritey,
                Player.WIDTH, Player.HEIGHT);
    }
}
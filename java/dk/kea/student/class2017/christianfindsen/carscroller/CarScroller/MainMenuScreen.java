package dk.kea.student.class2017.christianfindsen.carscroller.CarScroller;

import android.graphics.Bitmap;

import dk.kea.student.class2017.christianfindsen.carscroller.GameEngine;
import dk.kea.student.class2017.christianfindsen.carscroller.Screen;

/**
 * Created by Christian Findsen on 17-04-2017.
 */

public class MainMenuScreen extends Screen
{
    Bitmap backgroud;
    Bitmap startgame;
    float passedTime = 0;

    public MainMenuScreen(GameEngine game)
    {
        super(game);
        backgroud = game.loadBitmap("xcarbackground.png");
        startgame = game.loadBitmap("xstartgame.png");
    }

    @Override
    public void update(float deltaTime)
    {

        if (game.isTouchDown(0))
        {
            game.music.play();
            game.setScreen(new GameScreen(game));                                                 // create a new GameScreen with the game object and then go to it
            return;
        }

        game.drawBitmap(backgroud, 0, 0);

        // make the insertcoin to blink on the screen
        passedTime += deltaTime;
        if((passedTime - (int) passedTime) > 0.5f)
        {
            game.drawBitmap(startgame, 240 - startgame.getWidth()/2, 160 - startgame.getHeight() /2 );
        }
    }

    @Override
    public void pause()
    {

    }

    @Override
    public void resume()
    {

    }

    @Override
    public void dispose()
    {

    }
}
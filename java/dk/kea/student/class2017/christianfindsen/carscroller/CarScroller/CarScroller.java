package dk.kea.student.class2017.christianfindsen.carscroller.CarScroller;

import dk.kea.student.class2017.christianfindsen.carscroller.GameEngine;
import dk.kea.student.class2017.christianfindsen.carscroller.Screen;

/**
 * Created by Christian Findsen on 17-04-2017.
 */

public class CarScroller extends GameEngine
{
    @Override
    public Screen createStartScreen()
    {
        music = this.loadMusic("music.ogg");
        music.setLooping(true);
        return new MainMenuScreen(this);
    }

    public void onPause()
    {
        super.onPause();
        music.pause();
    }


    public void onResume()
    {
        super.onResume();
        music.play();
    }

    public void onDestroy()
    {
        super.onDestroy();
        music.stop();
        music.dispose();
    }
}
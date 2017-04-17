package dk.kea.student.class2017.christianfindsen.carscroller;

/**
 * Created by Christian Findsen on 04-03-2017.
 */

public class TouchEventPool extends Pool<dk.kea.student.class2017.christianfindsen.carscroller.TouchEvent>
{

    @Override
    protected dk.kea.student.class2017.christianfindsen.carscroller.TouchEvent newItem()
    {
        return new dk.kea.student.class2017.christianfindsen.carscroller.TouchEvent();
    }
}
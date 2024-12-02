package E914;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int width, int height) {
        super(width, height);
    }

    public double getPerimeter(){
        return 2 * (getHeight() + getWidth());
    }
    public double getArea(){
        return getHeight() * getWidth();
    }
}

import java.awt.*;
import java.util.*;

public class Ball extends Rectangle {

    Random random;
    int xVelocity;
    int yVelocity;
    int speed = 5;

    // Constructor that accepts parameters
    Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        random = new Random();

        // Set random initial direction
        int randomXDirection = random.nextInt(2) == 0 ? -1 : 1;
        int randomYDirection = random.nextInt(2) == 0 ? -1 : 1;

        setXDirection(randomXDirection * speed);
        setYDirection(randomYDirection * speed);
    }

    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, width, height);
    }
}

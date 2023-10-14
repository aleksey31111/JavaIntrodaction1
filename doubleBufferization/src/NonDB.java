/*
    Двойная Буферизация Отсутствует.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class NonDB extends JApplet {
    public void init() {
        setContentPane(new Display());
        getRootPane().setDoubleBuffered(false);
    }
    class Display extends JPanel
            implements MouseListener, MouseMotionListener {
        int x1, y1;
        boolean dragging;
        int offsetX, offsetY;
        Display() {
            x1 = 10;
            y1 = 10;
            setBackground(Color.white);
            addMouseListener(this);
        }
    }
}

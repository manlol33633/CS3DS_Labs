import java.awt.*;
import javax.swing.*;

public class FirstGraphicPanel extends JPanel {
	public FirstGraphicPanel(){
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawLine(0, 0, getWidth(), getHeight());
	}
}

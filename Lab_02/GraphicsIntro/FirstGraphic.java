import java.awt.*;
import javax.swing.*;

public class FirstGraphic extends JFrame {
	public static final int WIDTH = 1200;
	public static final int HEIGHT = 480;
	
	public FirstGraphic(String framename) {
		super(framename);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		add(new FirstGraphicPanel());
		setVisible(true);
	}
}

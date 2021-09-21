import java.awt.*;
import javax.swing.*;

public class BingoGraphics extends JFrame {
	private static final int WIDTH = 1380;
	private static final int HEIGHT = 775;
	
	public BingoGraphics(String framename) {
		super(framename);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		add(new BingoGraphicPanel());
		setVisible(true);
	}
}

import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;
import java.awt.Font;
import java.awt.font.*;

public class BingoGraphicPanel extends JPanel {
	private BufferedImage BlankBingo;
	
	public BingoGraphicPanel() {
		try {
			BlankBingo = ImageIO.read(new File("BlankBingoCard.jpg"));
		} catch (Exception e) {
			System.out.println("Exception Error");
			return;
		}
	}
	public void paint(Graphics g) {
		g.drawImage(BlankBingo, (getWidth()/2) - 305, (getHeight()/2) - 354, 609, 708, null);
		
		g.setColor(Color.BLACK);
		Font f = new Font("SansSerif", Font.BOLD, 70);
		g.setFont(f);
		g.drawString("46", 405, 230);
	}
}

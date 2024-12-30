package OnTap;

import java.awt.FlowLayout;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KhungGiaoDien {
	public static void main(String[] args) {
		// khung chứa 
		JFrame jf = new JFrame();
		jf.setSize(400,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.setTitle("Hello");
		
		JPanel jp = new JPanel();
		JLabel jl = new JLabel("Hello wordl!");
		jp.setLayout(new FlowLayout());
		jp.add(jl);
		jf.add(jp);
	}
}

package visuals;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private MyTextArea area;

	public MyTextArea getArea() {
		return area;
	}

	public void setArea(MyTextArea area) {
		this.area = area;
	}

	public void init() {
		add(area, BorderLayout.CENTER);
	}
}

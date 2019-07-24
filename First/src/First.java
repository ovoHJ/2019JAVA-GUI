import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class First {

	public static void main(String[] args) {
		// 하나 밖에 못 담는다.
		JFrame frame = new JFrame("창이름");
		// 그래서 JPanel을 사용하여 여러 개를 담는다.
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("기본값");
		label.setText("잘가");
		
		JLabel label2 = new JLabel("");
		label2.setText("가지마");
		
		// 똑같은 요소를 넣으면 소용이 없다.
		panel.add(label);
		panel.add(label2);
		frame.add(panel);
		// pack()을 하면 넣은 만큼 창 크기가 결정된다.
		frame.pack();
		frame.setVisible(true);
		// 엑스 버튼을 누르면 꺼지는 기능하다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

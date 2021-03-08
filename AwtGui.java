
import java.awt.event.WindowAdapter;
public class AwtGui {
	//public AwtGui() {// By extends Frame
		
	// 
	//setSize(400.300);
	//setVisible(true);
	//}
	public AwtGui () {
		Frame fame = new Frame("Hello first GUI");
		
		TextFiled textFiled = new TextFiled();
		
		textFiled.setBackground(Color.blue);
		textFiled.setSounds(20,90,150,30);
		
		Label label = new Label ("Your Name");
		label.setBounds(20,90,150,30);
		Button button = new Button("Click me");
		button.setBounds(20,40,80,30);
		frame.add(textFiled);
		frame.add(label);
		frame.add(button);
		
		frame.setSize(400, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		// frame.add windowListener(new windowAdapter(){
		// public void windowOpened(windowEvent e){
		public void windowsClosing(windowEvent e) {
			super.windowClosing(e);
			frame.dispose();
		}
	});
	public static void main(String[] args) {
		// TODI Auto-generted method sub
		AwtGui obj = new AwtGui();
	
		}
    }
		
		
		
 package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller{

	
	
	public static float genRandFloat(float from, float to) {
		float returnNum = (float) (Math.random() * (to-from) + from);
		return returnNum;
	}
	
	@FXML
	private Button button;
	
	@FXML
	private TextField to;
	
	@FXML
	private TextField from;
	
	@FXML
	public Text resultLabel;
	
	@FXML
	protected void onButtonClicked(ActionEvent e) {
		String f = to.getText();
		String t = from.getText();
		float from = Float.parseFloat(t);
		float to = Float.parseFloat(f);
		System.out.println(to);
		float number = genRandFloat(from,to);
		resultLabel.setText(String.format("%s",number));
	}
}

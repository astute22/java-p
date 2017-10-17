package sample3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class MainController {

	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Button btn3;
	
	@FXML
	private void initialize() throws Exception{
		btn1.setOnAction(e->{
			showAlert(AlertType.INFORMATION,"첫번쨰 버튼이 클릭되었습니다.");
		});
		btn2.setOnAction(e->{
			showAlert(AlertType.WARNING,"두번쨰 버튼이 클릭되었습니다.");
		});
		btn3.setOnAction(e->{
			showAlert(AlertType.ERROR,"세번쨰 버튼이 클릭되었습니다.");
		});
	}
	private void showAlert(AlertType alertType, String message){
		Alert alert = new Alert(alertType);
		alert.setTitle("안내창");
		alert.setHeaderText("버튼 클릭 안내");
		alert.setContentText(message);
		alert.showAndWait();
	}
}

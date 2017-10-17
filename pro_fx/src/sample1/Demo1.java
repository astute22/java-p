package sample1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo1 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		VBox box = new VBox();
		box.setPrefWidth(200);			//너비
		box.setPrefHeight(200);			//높이
		box.setAlignment(Pos.CENTER);	//정렬방식
		box.setSpacing(20);				//컨트롤간 간격
		
		//UI 컨트롤러 생성
		Label label = new Label("안녕하세요");
		Button button = new Button("버튼");
		
		box.getChildren().add(label);
		box.getChildren().add(button);
		
		//장면 생성
		Scene scene = new Scene(box);
		
		//장면을 무대에 올리기
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

package kr.co.jhta.school.ui;

import java.util.List;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import kr.co.jhta.school.service.CommonService;
import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Dept;

public class StudentAddFormController {

	@FXML private ComboBox<Dept> deptComboBox;
	@FXML private Button searchBtn;
	@FXML private TableView<Course> courseTableView;
	@FXML private Button registrationBtn;
	
	@FXML private TableColumn<Course, Number> courseNoColumn;
	@FXML private TableColumn<Course, String> subjectNameColumn;
	@FXML private TableColumn<Course, Number> quotaColumn;
	@FXML private TableColumn<Course, Number> regNumColumn;
	
	private CommonService commonService = new CommonService();
	
	private int loginedStudentNo;
	
	public void setLoginedStudentNo(int longinedStudentNo){
		this.loginedStudentNo = longinedStudentNo;
	}
	
	@FXML
	private void initialize() throws Exception{
		List<Dept> depts = commonService.getDepts();
		deptComboBox.setItems(FXCollections.observableArrayList(depts));
		deptComboBox.getSelectionModel().selectFirst();
	}
	
	@FXML
	private void clickedSearchBtn() throws Exception{
		//선택된 학과번호 획득
		Dept dept = deptComboBox.getSelectionModel().getSelectedItem();
		//선택된 학과에서 개설한 과정 조회
		List<Course> courses = commonService.getCoursesByDept(dept.getNo());
		//조회된 과정정보를 tableview에 추가
		courseTableView.setItems(FXCollections.observableArrayList(courses));
		//각각의 컬럼에 값을 연결
		courseNoColumn.setCellValueFactory(cellData->new SimpleIntegerProperty(cellData.getValue().getNo()));
		subjectNameColumn.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().getSubject().getName()));
		quotaColumn.setCellValueFactory(cellData->new SimpleIntegerProperty(cellData.getValue().getQuota()));
		regNumColumn.setCellValueFactory(cellData->new SimpleIntegerProperty(cellData.getValue().getRegNum()));
	}
}

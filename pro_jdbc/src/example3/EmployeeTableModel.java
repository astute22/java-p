package example3;

import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class EmployeeTableModel extends AbstractTableModel{
	
	private List<Employee> data = new Vector<>();
	private String[] columnNames = {"사원번호", "이름", "전화번호", "업무아이디", "급여"};
	
	public void setData(List<Employee> data){
		this.data = data;
	}
	
	public void clearData(){
		data.clear();
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return columnNames[column];
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Object value = null;
		
		Employee emp = data.get(rowIndex);
		if(columnIndex == 0){
			value = emp.getEmpId();
		}else if(columnIndex == 1){
			value = emp.getfName();
		}else if(columnIndex == 2){
			value = emp.getPh();
		}else if(columnIndex == 3){
			value = emp.getJobId();
		}else if(columnIndex == 4){
			value = emp.getSalary();
		}else {
			value = "";
		}
		
		return value;
	}
}

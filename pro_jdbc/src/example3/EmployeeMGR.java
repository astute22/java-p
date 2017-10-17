package example3;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class EmployeeMGR extends JFrame {
	private EmployeeDAO dao = new EmployeeDAO();
	private JTextField field = new JTextField();
	private JButton btn = new JButton("조회");
	private EmployeeTableModel model = new EmployeeTableModel();
	private JTable table = new JTable(model);
	
	public EmployeeMGR() {
		// TODO Auto-generated constructor stub
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(new JLabel("	이름	"),BorderLayout.WEST);
		panel.add(field, BorderLayout.CENTER);
		panel.add(btn, BorderLayout.EAST);
		
		this.add(panel, BorderLayout.NORTH);
		this.add(new JScrollPane(table), BorderLayout.CENTER);
		
		this.setBounds(100, 100, 600, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn.addActionListener((e)->{
			try{
				//model에 저장된 기존 데이터 삭제하기
				model.clearData();
				
				//입력필드의 값 읽어오기
				String searchName = field.getText();
				
				//db에서 직원정보 조회
				List<Employee> res = dao.findEmpByFirstName(searchName.toLowerCase());
				
				//model에 조회된 결과 담기
				model.setData(res);
				
				//데이터가 변경되었다는 사실 알림
				model.fireTableDataChanged();
				
			}catch (Exception ex) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "조회 실패", "에러", JOptionPane.ERROR_MESSAGE);
			}
		});
	}
	public static void main(String[] args) {
		new EmployeeMGR();
	}
}

package Main;

import DAO.EmployeImpl;
import Model.EmployeModel;
import View.EmployeView;
import Controller.EmployeController;

public class main {

	public static void main(String[] args) {
		EmployeView View = new EmployeView();
		EmployeImpl DAO =new EmployeImpl();
		EmployeModel Model = new EmployeModel(DAO);
		new Controller.EmployeController(Model,View);
		
		View.setVisible(true);
		
	}

}
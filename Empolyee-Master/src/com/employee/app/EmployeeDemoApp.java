package com.employee.app;

import com.employee.dao.EmployeeDao;

public class EmployeeDemoApp {

	public static void main(String[] args) {
		EmployeeDao ed = new EmployeeDao();
		ed.createEmployee("Nilesh", "Kadam", "CRISIL");
		ed.createEmployee("Harshu", "Kadam", "HouseWife");
		ed.createEmployee("Yogesh", "Kadam", "Om Goari");
		ed.createEmployee("Ashok", "Kadam", "Warna Bank");
		ed.createEmployee("Ranjana", "Kadam", "Pigmy");
		
		System.out.println("Empolyee by id :"+ed.getEmoloyeeById(3));
		
		System.out.println("Get Empolyee By Company Name :"+ed.getEmployeeByCompanyName("CRISIL"));

		System.out.println("Delete Empolyee :");
		ed.deleteEmployeeByIdQuery(3);
		
		System.out.println("delete All Employee");
		//ed.deleteAllEmployee();
		
		
	}

}

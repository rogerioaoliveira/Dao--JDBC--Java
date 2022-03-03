package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class ProgramTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1: seller findById ===");
		
		Department department = departmentDao.findById(3);
		
		System.out.println(department);
		
		System.out.println("\n=== Test 2: department findAll ===");
		
		List<Department> list = departmentDao.findAll();
		
		for (Department obj : list) {
		
			System.out.println(obj);
	
		}
		
		System.out.println("\n=== Test 3: department insert ===");
		
		Department newDepartment = new Department(null, "Anime");
		departmentDao.insert(newDepartment);
		
		System.out.println("Inserted! New Id: " + newDepartment.getId());

		System.out.println("\n=== Test 4: department update ===");
		
		department = departmentDao.findById(4);
		department.setName("Mangás");
		departmentDao.update(department);
		
		System.out.println("Update Completed!");
		
		System.out.println("\n=== Test 5: department delete ===");
		
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		
		departmentDao.deleteById(id);
		
		System.out.println("Delete completed!");

	}

}

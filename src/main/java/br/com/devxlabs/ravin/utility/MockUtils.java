package br.com.devxlabs.ravin.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.devxlabs.ravin.entities.Commanda;
import br.com.devxlabs.ravin.entities.Customer;
import br.com.devxlabs.ravin.entities.Employee;
import br.com.devxlabs.ravin.entities.Order;
import br.com.devxlabs.ravin.entities.Person;
import br.com.devxlabs.ravin.entities.Product;
import br.com.devxlabs.ravin.entities.Table;
import br.com.devxlabs.ravin.enums.CommandaStatus;
import br.com.devxlabs.ravin.enums.EmployeeAviability;
import br.com.devxlabs.ravin.enums.MeritalStatus;
import br.com.devxlabs.ravin.enums.ProductType;
import br.com.devxlabs.ravin.enums.Responsibility;
import br.com.devxlabs.ravin.enums.Schooling;
import br.com.devxlabs.ravin.enums.TableStatus;

public class MockUtils {

	public static List<Product> createProductList() {
		List<Product> productList = new ArrayList<>();

//		productList.add(new Product(1, "Pizza Margherita",
//				"Delicious traditional Italian pizza with tomato, mozzarella, and basil.", "PIZ001", 8.50, 15.00,
//				"20 minutes", "Bestseller!", ProductType.SNACK, true));
//
//		productList.add(new Product(2, "Spaghetti Carbonara",
//				"Classic Italian pasta dish with eggs, pancetta, and Parmesan cheese.", "PAS002", 6.75, 12.50,
//				"15 minutes", "A must-try!", ProductType.SNACK, true));
//
//		productList.add(
//				new Product(3, "Caesar Salad", "Fresh romaine lettuce, croutons, Parmesan cheese, and Caesar dressing.",
//						"SAL003", 4.50, 9.00, "10 minutes", "Light and healthy.", ProductType.SNACK, true));

		return productList;
	}

	public static List<Table> createTableList() {
		List<Table> tableList = new ArrayList<>();

		Employee employee1 = new Employee();
		List<Commanda> commands1 = new ArrayList<>();
		commands1.add(new Commanda());
		tableList.add(new Table(1, employee1, commands1, "Table 1", "TAB001", 1, TableStatus.AVAILABLE));

		Employee employee2 = new Employee();
		List<Commanda> commands2 = new ArrayList<>();
		commands2.add(new Commanda(2, null, null, null, "CMD002", null, CommandaStatus.OPEN));
		tableList.add(new Table(2, employee2, commands2, "Table 2", "TAB002", 2, TableStatus.AVAILABLE));

		return tableList;
	}

	public static List<Person> createPersonList() {
		List<Person> personList = new ArrayList<>();

		personList.add(
				new Person(1, "John Doe", "123 Main St", "555-1234", "12345678901", new Date(), "No allergies.", true));
		personList.add(new Person(2, "Jane Smith", "456 Oak Ave", "555-5678", "98765432109", new Date(),
				"Lactose intolerant.", true));
		personList.add(new Person(3, "Bob Johnson", "789 Maple Rd", "555-9876", "45678912301", new Date(),
				"No special instructions.", true));

		return personList;
	}

	public static List<Commanda> createCommandaList() {
		List<Commanda> commandaList = new ArrayList<>();

		Table table1 = new Table();
		Customer customer1 = new Customer();
		List<Order> orders1 = new ArrayList<>();
		orders1.add(new Order());
		orders1.add(new Order());
		commandaList.add(
				new Commanda(1, table1, customer1, orders1, "CMD001", "Extra napkins, please.", CommandaStatus.OPEN));

		Table table2 = new Table();
		Customer customer2 = new Customer();
		List<Order> orders2 = new ArrayList<>();
		orders2.add(new Order());
		orders2.add(new Order());
		commandaList
				.add(new Commanda(2, table2, customer2, orders2, "CMD002", "No onions, please.", CommandaStatus.OPEN));

		return commandaList;
	}

	public static List<Employee> createEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(1, "1234567", MeritalStatus.SINGLE, Schooling.HIGHER, Responsibility.WAITER,
				new Date(), new Date(), EmployeeAviability.AVAILABLE, 12312));
		employeeList.add(new Employee(2, "34533345", MeritalStatus.MARRIED, Schooling.HIGH, Responsibility.COOK,
				new Date(), new Date(), EmployeeAviability.AVAILABLE, 3453));

		return employeeList;
	}

}

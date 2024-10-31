public class Main {

    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = retrieveEmployeeFromDatabase();

        // Create an EmployeeView object
        EmployeeView employeeView = new EmployeeView();

        // Create an EmployeeController object and pass the model (employee) and view (employeeView)
        EmployeeController employeeController = new EmployeeController(employee, employeeView);

        employeeController.setEmployeeName("Nirnay");
        System.out.print("\nEmployee Details after Updating");

        employeeController.updateView();
    }

    private static Employee retrieveEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setName("Anu");
        employee.setId("11");
        employee.setDepartment("Salesforce");
        return employee;
    }
}

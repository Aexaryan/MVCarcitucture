public class EmployeeController {

    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeId(String id) {
        model.setId(id);
    }

    public String getEmployeeId() {
        return model.getId();
    }

    // Add the updateView() method
    public void updateView() {
        view.displayEmployeeDetails(model.getName(), model.getId(), model.getDepartment());
    }
}
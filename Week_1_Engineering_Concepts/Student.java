package Week_1_Engineering_Concepts.DesignPatternsMaster;
// Save as Student.java
public class Student {
    private String name;
    public String getName() { return name; } public void setName(String n) { this.name = n; }
}

class StudentView {
    public void displayStudentDetails(String name) { System.out.println("Student View: Name = " + name); }
}

class StudentController {
    private Student model; private StudentView view;
    public StudentController(Student m, StudentView v) { this.model = m; this.view = v; }
    public void setStudentName(String name) { model.setName(name); }
    public void updateView() { view.displayStudentDetails(model.getName()); }
}
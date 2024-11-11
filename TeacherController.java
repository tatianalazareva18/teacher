import java.util.List;

class TeacherController {
    private TeacherService service;
    private TeacherView view;

    public TeacherController(TeacherService service, TeacherView view) {
        this.service = service;
        this.view = view;
    }

    public void createTeacher(String name, String subject) {
        Teacher teacher = service.createTeacher(name, subject);
        view.teacherCreated(teacher);
    }

    public void editTeacher(int id, String name, String subject) {
        Teacher teacher = service.editTeacher(id, name, subject);
        if (teacher != null) {
            view.teacherUpdated(teacher);
        } else {
            view.teacherNotFound();
        }
    }

    public void displayAllTeachers() {
        List<Teacher> teachers = service.getAllTeachers();
        view.displayAllTeachers(teachers);
    }
}

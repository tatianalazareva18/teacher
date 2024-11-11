import java.util.List; 

class TeacherView {
    public void displayTeacher(Teacher teacher) {
        System.out.println(teacher);
    }

    public void displayAllTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void teacherCreated(Teacher teacher) {
        System.out.println("Teacher " + teacher.getName() + " has been created successfully!");
    }

    public void teacherUpdated(Teacher teacher) {
        System.out.println("Teacher " + teacher.getName() + " has been updated successfully!");
    }

    public void teacherNotFound() {
        System.out.println("Teacher not found.");
    }
}
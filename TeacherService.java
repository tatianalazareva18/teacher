import java.util.ArrayList;
import java.util.List;

class TeacherService {
    private List<Teacher> teachers;
    private int nextId;

    public TeacherService() {
        this.teachers = new ArrayList<>();
        this.nextId = 1;
    }

    public Teacher createTeacher(String name, String subject) {
        Teacher teacher = new Teacher(nextId++, name, subject);
        teachers.add(teacher);
        return teacher;
    }

    public Teacher editTeacher(int id, String name, String subject) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                if (name != null) teacher.setName(name);
                if (subject != null) teacher.setSubject(subject);
                return teacher;
            }
        }
        return null;
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}
public class Main {
    public static void main(String[] args) {
        TeacherService service = new TeacherService();
        TeacherView view = new TeacherView();
        TeacherController controller = new TeacherController(service, view);

        // Создаем учителей
        controller.createTeacher("John Smith", "Mathematics");
        controller.createTeacher("Mary Johnson", "Physics");

        // Редактируем учителя
        controller.editTeacher(1, null, "Algebra");

        // Отображаем всех учителей
        controller.displayAllTeachers();
    }
}
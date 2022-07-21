import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private static CourseManager courseManager;

    private final List<Course> courses = new ArrayList<>();

    private CourseManager() {

    }

    public static CourseManager getInstance() {
        if(courseManager == null) {
            courseManager = new CourseManager();
        }

        return courseManager;
    }

    public void add(Course course) {
        courses.add(course);
    }

    public void addToStudentsCourseList(Student student, Course course) {

        student.addToCourseList(course);
        System.out.println(course.getName() + " " + student.getName() + "'nin kurs listesine eklendi");
    }

    public void addToCart(Course course) {
        System.out.println(course.getName() + " sepete eklendi.");
    }

    public List<Course> getAll() {
        return courses;
    }
}

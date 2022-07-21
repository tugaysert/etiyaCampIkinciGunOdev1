import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        Category category1 = new Category();
        Instructor instructor1 = new Instructor();
        Student student1 = new Student();

        instructor1.setId(1);
        instructor1.setFirstName("Engin");
        instructor1.setLastName("Demirog");

        category1.setId(1);
        category1.setName("test");

        course1.setId(1);
        course1.setName("UNITTEST");
        course1.setCategory(category1);
        course1.setInstructor(instructor1);


        Category category2 = new Category(2, "yazilim");
        Instructor instructor2 = new Instructor(2, "ENGIN", "KALAYCI");
        Course course2 = new Course(2, "JAVA-REACT", category2, instructor2);

        System.out.println(course1.getName() + " " + course1.getCategory().getName()
                + " " + course1.getInstructor().getFirstName()
                + " " + course1.getInstructor().getLastName());

        System.out.println(course1);
        System.out.println(course2);

        student1.setId(1);
        student1.setFirstName("Mahmut");
        student1.setLastName("Kirazci");

        student1.addToCourseList(course1);
        student1.addToCourseList(course2);

        Course course3 = new Course(3, "C++", category2, instructor1);

        CourseManager courseManager = new CourseManager();
        courseManager.addToCart(course3);
        courseManager.addToStudentsCourseList(student1, course3);
        System.out.println(student1);


    }
}

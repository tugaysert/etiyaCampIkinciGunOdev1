public class CourseManager {

    public void addToStudentsCourseList(Student student, Course course) {

        student.addToCourseList(course);
        System.out.println(course.getName()+" " + student.getName() + "'nin kurs listesine eklendi");
    }

    public  void  addToCart(Course course) {
        System.out.println(course.getName() + " sepete eklendi.");
    }
}

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import logging.DataBaseLogger;
import logging.FileLogger;
import logging.Logger;
import logging.MailLogger;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new FileLogger(), new MailLogger(), new DataBaseLogger()};
        Category category1 = new Category(1, "Java");
        Category category2 = new Category(2, ".net");

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);

        System.out.println("-----------------------------------");
        categoryManager.add(category2);
        System.out.println("-----------------------------------");

        Instructor instructor1 = new Instructor(1, "Engin", "Demirog");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.add(instructor1);
        System.out.println("-----------------------------------");

        Course course1 = new Course(1, "Java2021", 2000, 1, 1);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);

        System.out.println("-----------------------------------");

        Course course2 = new Course(1, "Java2021", -20, 1, 1);
        CourseManager courseManager1 = new CourseManager(new JdbcCourseDao(), loggers);
        courseManager1.add(course2);     // Fiyat - olduğu için hata verir.


    }
}
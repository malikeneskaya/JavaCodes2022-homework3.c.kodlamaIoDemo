package business;


import dataAccess.CourseDao;
import entities.Course;
import logging.Logger;


public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;


    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        Course[] courses = {new Course(1, "Temel Duzey Java", 2000, 1, 1),
                new Course(2, "Ilerı Duzey Java", 3500, 2, 2)};

        for (Course course1 : courses) {
            if (course1.getCourseName().equalsIgnoreCase(course.getCourseName())) {
                throw new Exception("Bu isimle zaten bir kurs mevcut!");
            } else if (course.getUnitPrice() < 0) {
                throw new Exception("Kurs Fiyati 0 dan dusuk olamaz!");
            }
        }
        courseDao.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }

    }
}


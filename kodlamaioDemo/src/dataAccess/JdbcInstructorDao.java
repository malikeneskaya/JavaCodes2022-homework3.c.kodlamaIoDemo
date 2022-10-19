package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile eklendi : "+instructor.getFirstName()+" "+instructor.getLastName());
    }
}

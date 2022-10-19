package entities;

public class Course {
    private int id;
    private String courseName;
    private double unitPrice;
    private int instructorId;
    private int categoryId;

    public Course() {
    }

    public Course(int id, String courseName, double unitPrice, int instructorId, int categoryId) {
        this.id = id;
        this.courseName = courseName;
        this.unitPrice = unitPrice;
        this.instructorId = instructorId;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}

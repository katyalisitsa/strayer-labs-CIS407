public class Course {

    private String courseNumber;
    private String courseTitle;

    // TODO: Define mutator methods -
    //       setCourseNumber(), setCourseTitle()

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }


    // TODO: Define accessor methods -
    //       getCourseNumber(), getCourseTitle()

    public String getCourseNumber() {
        return this.courseNumber;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }

    // TODO: Define printInfo()

    public void printInfo() {
        System.out.println("Course Information: ");
        System.out.println("   Course Number: " + courseNumber);
        System.out.println("   Course Title: " + courseTitle);
    }

}

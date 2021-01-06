public class OfferedCourse extends Course {

    private String instructorName;
    private String term;
    private String classTime;

    // TODO: Define mutator methods -
    //      setInstructorName(), setTerm(), setClassTime()

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }


    // TODO: Define accessor methods -
    //      getInstructorName(), getTerm(), getClassTime()

    public String getInstructorName() {
        return this.instructorName;
    }

    public String getTerm() {
        return this.term;
    }

    public String getClassTime() {
        return this.classTime;
    }
}
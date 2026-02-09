public class ReportCardVO {

    private int rollNumber;
    private String name;
    private String grade;

    public ReportCardVO(String name, String grade, int rollNumber) {
        this.name = name;
        this.grade = grade;
        this.rollNumber = rollNumber;
    }

    public ReportCardVO() {
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}

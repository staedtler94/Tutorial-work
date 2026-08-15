package business_cases.university;

public class Subject {

    int subId;

    String name;

    int maxMarks;

    int marksObtained;

    Subject(int id, String subName, int maxMarks){
        subId = id;
        name = subName;
        this.maxMarks = maxMarks;
        setMarksObtained(0);
    }

    public int getSubId() {
        return subId;
    }

    public String getName() {
        return name;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subId=" + subId +
                ", name='" + name + '\'' +
                ", maxMarks=" + maxMarks +
                ", marksObtained=" + marksObtained +
                '}';
    }
}

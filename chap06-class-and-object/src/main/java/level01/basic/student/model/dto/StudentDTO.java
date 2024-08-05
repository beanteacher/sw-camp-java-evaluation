package level01.basic.student.model.dto;

public class StudentDTO {

    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO() {}

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public int getClassroom() {
        return this.classroom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getKor() {
        return this.kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getEng() {
        return this.eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getMath() {
        return this.math;
    }

    public String getInformation(StudentDTO[] students) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < students.length; i++) {
            result.append("학년="+students[i].grade+", "+
                    "반="+students[i].classroom+", "+
                    "이름="+students[i].name+", "+
                    "국어="+students[i].kor+", "+
                    "영어="+students[i].eng+", "+
                    "수학="+students[i].math+", "+
                    "평균="+(students[i].kor+students[i].eng+students[i].math)/3);
            result.append("\r\n");
        }
        return result.toString();
    }
}

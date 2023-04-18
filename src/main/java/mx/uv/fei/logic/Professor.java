package mx.uv.fei.logic;

public class Professor {
    private int professorId;
    private String professorName;
    private String professorLastName;
    private String professorEmail;
    private int userId;

    public Professor() {}

    public Professor(String professorName, String professorLastName, String professorEmail, int userId) {
        this.professorName = professorName;
        this.professorLastName = professorLastName;
        this.professorEmail = professorEmail;
        this.userId = userId;
    }

    public int getProfessorId() {
        return professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public String getProfessorLastName() {
        return professorLastName;
    }
    
    public String getProfessorEmail() {
        return professorEmail;
    }

    public int getUserId() {
        return userId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public void setProfessorLastName(String professorLastName) {
        this.professorLastName = professorLastName;
    }
    
    public void setProfessorEmail(String professorEmail) {
        this.professorEmail = professorEmail;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

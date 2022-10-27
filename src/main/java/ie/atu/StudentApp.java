package ie.atu;

public class StudentApp {
    private  String Name;
    private String email;
    private String course;

  public StudentApp(){
      this.Name = "";
      this.email = "";
      this.course = "";
  }
    public StudentApp(String name) {
        this.Name = name;
    }

    public StudentApp(String name, String email, String studentemail) {
        this.Name = name;
        this.email = email;
        this.course = studentemail;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getcourse() {
        return course;
    }

    public void setcourse(String studentemail) {
        this.course = studentemail;
    }
}

package pillars.encapsulation;

public class Student {
    private int USN;
    private String email;
    //setters->assign attributes
    public void setUSN(int USN) {

        this.USN = USN;
    }
    public void setEmail(String email){

        this.email=email;
    }
    //getters->retrieve attributes
    public int getUSN(){
        return this.USN;
    }
    public String getemail(){
        return this.email;
    }
}

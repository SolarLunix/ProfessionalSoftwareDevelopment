package Week9.University;

/*******
 *   Part2:Week9.University
 *   File: Member
 *   Created by: Melissa Melaugh
 *   Created on: 18/11/2020
 *   Updated on: 21/11/2020
 *   Project Description: A member of the university
 *******/
public abstract class Member {
    private String name;
    private String email;

    public Member(){
        this("", "");
    }

    public Member(String name, String email){
        this.name = name;
        this.email = email;
    }

    protected void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    protected void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    protected abstract String getStatus();

    public String toString(){
        String out = "\nName: \t" + this.name;
        out += "\nEmail: \t" + this.email;
        return  out;
    }
}

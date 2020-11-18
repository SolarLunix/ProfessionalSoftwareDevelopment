package Week9.University;

/*******
 *   Part2:Week9.University
 *   File: Member
 *   Created by: Melissa Melaugh
 *   Created on: 18/11/2020
 *   Updated on: 18/11/2020
 *   Project Description: A member of the university
 *******/
public abstract class Member {
    String name;
    String email;

    Member(){
        this("UNKNOWN", "UNKNOWN");
    }

    Member(String name, String email){
        this.name = name;
        this.email = email;
    }

    abstract String getStatus();
}

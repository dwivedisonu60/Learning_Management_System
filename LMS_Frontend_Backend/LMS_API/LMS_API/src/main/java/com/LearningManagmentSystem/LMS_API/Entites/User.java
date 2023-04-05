package com.LearningManagmentSystem.LMS_API.Entites;


import com.LearningManagmentSystem.LMS_API.DAO.UserRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="UserTable")
public class User {

    @Id
    @SequenceGenerator(name = "User_Id_Generator", sequenceName = "User_Id_seq",allocationSize = 1 )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User_Id_Generator")

    public int id;


    private String name;

    private String Role;

    private String Password;

    private String Email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Role='" + Role + '\'' +
                ", Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

    public User(String name, String role, String password, String email) {
        this.name = name;
        Role = role;
        Password = password;
        Email = email;
    }

    public User(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

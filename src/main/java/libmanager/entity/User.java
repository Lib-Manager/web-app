package libmanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import libmanager.enumeration.Role;

import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "role")
    private Role role;

    @Column(name = "sex")
    private boolean sex;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "birthDate")
    private Date birthDate;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "mail")
    private String mail;

    @Column(name = "pwd")
    private String pwd;

    @Column(name = "subscribe")
    private boolean subscribe;

    @Column(name = "subscriptionStarting")
    private Date subscriptionStarting;

    @Column(name = "subscriptionEnding")
    private Date subscriptionEnding;

    @Column(name = "userCreationDate")
    private Date userCreationDate;

    @Column(name = "userLastModificationDate")
    private Date userLastModificationDate;
}

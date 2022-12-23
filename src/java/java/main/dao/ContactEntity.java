package main.dao;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "contact", schema = "javastudy", catalog = "")
public class ContactEntity {
    private int id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int version;
    private Collection<ContactHobbyDetailEntity> contactHobbyDetailsById;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 60)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 40)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "birth_date", nullable = true)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "version", nullable = false)
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactEntity that = (ContactEntity) o;
        return id == that.id && version == that.version && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(birthDate, that.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, birthDate, version);
    }

    @OneToMany(mappedBy = "contactByContactId")
    public Collection<ContactHobbyDetailEntity> getContactHobbyDetailsById() {
        return contactHobbyDetailsById;
    }

    public void setContactHobbyDetailsById(Collection<ContactHobbyDetailEntity> contactHobbyDetailsById) {
        this.contactHobbyDetailsById = contactHobbyDetailsById;
    }
}

package main.dao;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "hobby", schema = "javastudy", catalog = "")
public class HobbyEntity {
    private String hobbyId;
    private Collection<ContactHobbyDetailEntity> contactHobbyDetailsByHobbyId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "hobby_id", nullable = false, length = 20)
    public String getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(String hobbyId) {
        this.hobbyId = hobbyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HobbyEntity that = (HobbyEntity) o;
        return Objects.equals(hobbyId, that.hobbyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hobbyId);
    }

    @OneToMany(mappedBy = "hobbyByHobbyId")
    public Collection<ContactHobbyDetailEntity> getContactHobbyDetailsByHobbyId() {
        return contactHobbyDetailsByHobbyId;
    }

    public void setContactHobbyDetailsByHobbyId(Collection<ContactHobbyDetailEntity> contactHobbyDetailsByHobbyId) {
        this.contactHobbyDetailsByHobbyId = contactHobbyDetailsByHobbyId;
    }
}

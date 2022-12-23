package main.dao;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contact_tel_detail", schema = "javastudy", catalog = "")
public class ContactTelDetailEntity {
    private int id;
    private int contactId;
    private String telType;
    private String telNumber;
    private int version;
    private ContactEntity contactByContactId;

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
    @Column(name = "contact_id", nullable = false)
    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    @Basic
    @Column(name = "tel_type", nullable = false, length = 20)
    public String getTelType() {
        return telType;
    }

    public void setTelType(String telType) {
        this.telType = telType;
    }

    @Basic
    @Column(name = "tel_number", nullable = false, length = 20)
    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
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
        ContactTelDetailEntity that = (ContactTelDetailEntity) o;
        return id == that.id && contactId == that.contactId && version == that.version && Objects.equals(telType, that.telType) && Objects.equals(telNumber, that.telNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contactId, telType, telNumber, version);
    }

    @ManyToOne
    @JoinColumn(name = "contact_id", referencedColumnName = "id", nullable = false)
    public ContactEntity getContactByContactId() {
        return contactByContactId;
    }

    public void setContactByContactId(ContactEntity contactByContactId) {
        this.contactByContactId = contactByContactId;
    }
}

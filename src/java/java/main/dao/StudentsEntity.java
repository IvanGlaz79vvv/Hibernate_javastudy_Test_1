package main.dao;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "students", schema = "mywork", catalog = "")
public class StudentsEntity {
    private int id;
    private String fio;
    private Integer ball;
    private String lesson;

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
    @Column(name = "FIO", nullable = true, length = 255)
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Basic
    @Column(name = "ball", nullable = true)
    public Integer getBall() {
        return ball;
    }

    public void setBall(Integer ball) {
        this.ball = ball;
    }

    @Basic
    @Column(name = "lesson", nullable = true, length = 255)
    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsEntity that = (StudentsEntity) o;
        return id == that.id && Objects.equals(fio, that.fio) && Objects.equals(ball, that.ball) && Objects.equals(lesson, that.lesson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio, ball, lesson);
    }
}

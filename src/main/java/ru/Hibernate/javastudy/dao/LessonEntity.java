package ru.Hibernate.javastudy.dao;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lesson", schema = "mywork", catalog = "")
public class LessonEntity {
    private int id;
    private String lesson;
    private Integer lessonId;
    private String mark;

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
    @Column(name = "Lesson", nullable = true, length = 255)
    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Basic
    @Column(name = "Lesson_id", nullable = true)
    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    @Basic
    @Column(name = "mark", nullable = true, length = 255)
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LessonEntity that = (LessonEntity) o;
        return id == that.id && Objects.equals(lesson, that.lesson) && Objects.equals(lessonId, that.lessonId) && Objects.equals(mark, that.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lesson, lessonId, mark);
    }
}

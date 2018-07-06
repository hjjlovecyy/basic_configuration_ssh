package org.hjj.pojo;

import java.io.Serializable;

/**
 * Created by hejiajun
 * On 2018/7/4
 */
public class Student implements Serializable {
    private int id;
    private String studentName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}

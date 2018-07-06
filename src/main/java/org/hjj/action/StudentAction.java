package org.hjj.action;

import com.opensymphony.xwork2.ActionContext;
import org.hjj.dao.BaseDao;
import org.hjj.pojo.Student;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hejiajun
 * On 2018/7/4
 */
@Scope("prototype")
@Controller
public class StudentAction {
    @Resource(name = "studentDao")
    private BaseDao baseDao;

    private String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String add() {
        return "add";
    }

    public String listAll() {
        ActionContext actionContext = ActionContext.getContext();

        //get HttpServletRequest
        Map<String,Object> request = (Map) actionContext.get("request");
        request.put("students", baseDao.listAll());
        return "all";
    }
}

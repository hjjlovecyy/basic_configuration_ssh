package org.hjj.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hjj.pojo.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hejiajun
 * On 2018/7/5
 */
@Transactional(propagation = Propagation.REQUIRED)
@Repository(value = "studentDao")
public class StudentDaoImpl extends BaseDao<Student> {
    @Override
    public void saveOrUpdate(Student student) {
        sessionFactory.getCurrentSession().saveOrUpdate(student);
    }

    @Override
    public Student findById(int id) {
        String hql = "from Student s where s.id = ?";
        Query query = sessionFactory.getCurrentSession()
                .createQuery(hql).setParameter(0, id);
        return (Student) query.uniqueResult();
    }

    @Override
    public List<Student> listAll() {
        String hql = "from Student";
        Query query = sessionFactory.getCurrentSession()
                .createQuery(hql);
        return query.list();
    }

    @Override
    public void delete(int id) {
        String hql = "from Student s where s.id = ?";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql).setParameter(0, id);
        session.delete(query.uniqueResult());
    }
}

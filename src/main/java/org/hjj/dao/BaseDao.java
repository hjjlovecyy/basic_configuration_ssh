package org.hjj.dao;

import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by hejiajun
 * On 2018/7/5
 */
public abstract class BaseDao<T extends Serializable> {
    @Resource
    protected SessionFactory sessionFactory;

    public abstract void saveOrUpdate(T t);

    public abstract T findById(int id);

    public abstract List<T> listAll();

    public abstract void delete(int id);
}

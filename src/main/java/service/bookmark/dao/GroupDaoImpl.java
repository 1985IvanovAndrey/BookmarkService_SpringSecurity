package service.bookmark.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import service.bookmark.entity.Bookmark;
import service.bookmark.entity.Groups;
import service.bookmark.entity.Groups;

import java.util.List;

@Transactional
@Repository
public class GroupDaoImpl implements GroupDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Groups> listGroup() {
        Session session = sessionFactory.getCurrentSession();
        List<Groups> listGroup = session.createQuery("from Groups").list();
        return listGroup;
    }

    @Override
    public void addGroup(Groups group) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(group);

    }

    @Override
    public void deleteGroup(int id) {
        Session session = sessionFactory.getCurrentSession();
        Groups group = (Groups) session.load(Groups.class, new Integer(id));
        if (group != null) {
            session.delete(group);
        }
    }

    @Override
    public Groups getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Groups group = (Groups) session.get(Groups.class, new Integer(id));
        //System.out.println(group);
        return group;
    }

    @Override
    public List<Bookmark> listBookmark() {
        Session session = sessionFactory.getCurrentSession();
        List<Bookmark> listBookmark = session.createQuery("from Bookmark").list();
        return listBookmark;
    }
}

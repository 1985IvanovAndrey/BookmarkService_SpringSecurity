package service.bookmark.dao;

import service.bookmark.entity.Bookmark;
import service.bookmark.entity.Groups;
import service.bookmark.entity.Groups;

import java.util.List;

public interface GroupDao {

    public List<Groups> listGroup();

    void addGroup(Groups group);

    void deleteGroup(int id);

    Groups getById(int id);

    public List<Bookmark> listBookmark();

   // void addBookmark(String bookmark,int id);


    void addBookmark(Bookmark bookmark, int id);

    List<Bookmark> getBookmarksfromOneGroup(int id);

    boolean checkNewGroupOnDublicate(Groups group);
}

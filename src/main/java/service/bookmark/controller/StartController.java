package service.bookmark.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.bookmark.dao.GroupDao;
import service.bookmark.entity.Bookmark;
import service.bookmark.entity.Groups;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/")
public class StartController {
    int idik;
    List<Bookmark> bookmarks;
    String nameGroup;
    String name;
    String message;

    @Autowired
    private GroupDao groupDao;

    @GetMapping
    public String getAllGroups(Model model) {
        model.addAttribute("listGroup", groupDao.listGroup());
        model.addAttribute("listBookmarks", bookmarks);
        model.addAttribute("nameGroup", nameGroup);
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        message = null;
        name = null;
        bookmarks=null;
        return "index";
    }

    @RequestMapping("add")
    public String addGroup(@ModelAttribute("group") Groups group) {
        int count = 0;
        if (groupDao.checkNewGroupOnDublicate(group) == true) {
            message = "Уже есть группа с названием " + group.getNameGroup();
            count++;
        }
        if (group.getNameGroup() == null) {
            name = "group";
            count++;

        }
        if (count > 0) {
            return "redirect:/";
        } else {
            groupDao.addGroup(group);
            return "redirect:/";
        }
    }

    @RequestMapping("remove/{id}")
    public String deleteGroup(@PathVariable("id") int id) {
        groupDao.deleteGroup(id);
        System.out.println(id);
        return "redirect:/";
    }

    @RequestMapping("addInGroup/{id}")
    public String addBookmarkInGroup(@PathVariable("id") int id, Model model) {
        idik = id;
        model.addAttribute("nameGroup1", groupDao.getById(id).getNameGroup());
        return "addBookmark";
    }

    @RequestMapping("addBookmark")
    public String addBookmark(@ModelAttribute("bookmark") Bookmark bookmark, Model model) {
        model.addAttribute("nameGroup1", groupDao.getById(idik).getNameGroup());
        System.out.println(bookmark);
        int count = 0;
        if (bookmark.getBookmark() == "") {
            model.addAttribute("name_bookmark", "name_bookmark");
            count++;
        }
        if (bookmark.getDescription() == "") {
            model.addAttribute("description", "description_bookmark");
            count++;
        }
        if (bookmark.getUrlBookmark() == "") {
            model.addAttribute("url", "url_bookmark");
            count++;
        }
        if (count > 0) {
            return "addBookmark";

        } else {
            groupDao.addBookmark(bookmark, idik);
            return "redirect:/";
        }
    }


    @RequestMapping("getBookmarksFromOneGroup/{id}")
    public String getBookmarksFromOneGroup(@PathVariable("id") int id) {
        idik = id;
        List<Bookmark> bookmarkList = groupDao.getBookmarksfromOneGroup(idik);
        bookmarks = bookmarkList;
        nameGroup = groupDao.getById(id).getNameGroup();
        return "redirect:/";
    }
}

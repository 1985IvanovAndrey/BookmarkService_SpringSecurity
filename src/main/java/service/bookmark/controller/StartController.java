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
import java.util.List;


@Controller
@RequestMapping("/")
public class StartController {
    int idik;

    @Autowired
    private GroupDao groupDao;

    @GetMapping
    public String getAllGroups(Model model) {
        model.addAttribute("listGroup", groupDao.listGroup());
        return "index";
    }

    @RequestMapping("add")
    public String addGroup(@ModelAttribute("group") Groups group) {
        groupDao.addGroup(group);
        return "redirect:/";
    }

    @RequestMapping("remove/{id}")
    public String deleteGroup(@PathVariable("id") int id) {
        groupDao.deleteGroup(id);
        System.out.println(id);
        return "redirect:/";
    }

    @RequestMapping("addInGroup/{id}")
    public String addBookmarkInGroup(@PathVariable("id") int id) {
        idik = id;
        return "addBookmark";
    }

    @RequestMapping("addBookmark")
    public String addBookmark(@ModelAttribute("bookmark") String bookmark) {
        groupDao.addBookmark(bookmark,idik);
        return "redirect:/";
    }
}

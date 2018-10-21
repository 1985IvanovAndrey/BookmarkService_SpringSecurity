package service.bookmark.service;

import service.bookmark.entity.UserInfo;

import java.util.List;

public interface UserService {
    void save(UserInfo userInfo);

    UserInfo findByUsername(String username);

    List<UserInfo> userList();

    void delUser(long id);
}

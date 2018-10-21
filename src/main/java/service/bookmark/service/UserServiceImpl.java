package service.bookmark.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import service.bookmark.entity.Role;
import service.bookmark.entity.UserInfo;
import service.bookmark.repository.RoleRepository;
import service.bookmark.repository.UserRepository;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(UserInfo userInfo) {
//        userInfo.setPassword(bCryptPasswordEncoder.encode(userInfo.getPassword()));
//        Role role = roleRepository.findOne(2L);
//        Set<Role> roles = new HashSet<>(Collections.singleton(role));
//        userInfo.setRoles(roles);
//        System.out.println(userInfo);
//        System.out.println(roles);
//        userRepository.save(userInfo);
    }

    @Override
    public UserInfo findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<UserInfo> userList() {
        List<UserInfo>listUser=new ArrayList<>();
        for (UserInfo user : userRepository.findAll()) {
            UserInfo userInfo=new UserInfo();
            userInfo.setId(user.getId());
            userInfo.setPassword((user.getPassword()));
            userInfo.setUsername(user.getUsername());
            for (Role role : user.getRoles()) {
                userInfo.setUserRole(role.getName());
            }
            listUser.add(userInfo);
        }
        return listUser;
    }

    @Override
    public void delUser(long id) {
//        userRepository.delete(id);
    }
}

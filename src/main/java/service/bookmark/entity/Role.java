package service.bookmark.entity;

import service.bookmark.entity.UserInfo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Role {
    private Long id;
    private String name;
    private Set<UserInfo> userInfos;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "roles")
    public Set<UserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(Set<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }

}

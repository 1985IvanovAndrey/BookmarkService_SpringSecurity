package service.bookmark.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import service.bookmark.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Long> {
    UserInfo findByUsername(String username);
}

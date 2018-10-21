package service.bookmark.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import service.bookmark.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{


}

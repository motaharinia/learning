package com.motaharinia.persistence.orm.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    User findUserByUsername(String username);
//    User findUserById(Integer id);
//    List<User> findAllBy
}

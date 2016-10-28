package com.SpringBootTest.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lich on 10/24/16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String userName);

//    com.SpringBootTest.com.SpringBootTest.domain.User.
// User findByNameAndAge(String userName, Integer age);

//    @Query("from User u where u.userName=:userName")
//    User findUser(@Param("userName") String userName);
}

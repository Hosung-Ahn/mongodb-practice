package com.example.demo.service;

import com.example.demo.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void create() {
        // given
        String id = "1";
        String username = "hosung";
        String age = "27";

        // when
        userService.saveUser(new User(id, username, age));

        // then
        User user = userService.findUserById(id);
        assertThat(user.getId()).isEqualTo(id);
    }

    @Test
    public void readAndUpdate() {
        // given
        String id = "1";
        String username = "hosung";
        String age = "30";

        // when
        userService.saveUser(new User(id, username, age));

        // then
        User user = userService.findUserById(id);
        assertThat(user.getUsername()).isEqualTo(username);
    }

    @Test
public void delete() {
        // given
        String id = "1";
        String username = "hosung";
        String age = "30";

        // when
        userService.saveUser(new User(id, username, age));
        userService.deleteUserById(id);

        // then
        User user = userService.findUserById(id);
        assertThat(user).isNull();
    }
}
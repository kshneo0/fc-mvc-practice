package org.example.mvc.repository;

import org.example.mvc.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * author :  sanghoonkim
 * date : 2022/12/30
 */
public class UserRepository {
    private static Map<String, User> users = new HashMap<>();

    public static void save(User user){
        users.put(user.getUserId(),user);
    }

    public static Collection<User> findAll() {
        return users.values();
    }
}

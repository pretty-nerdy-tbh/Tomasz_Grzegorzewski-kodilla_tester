package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames(){
        List<String> chemistGroupUsernames = UsersManager.getFilterChemistGroupUsernames();
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");
        assertEquals(expectedList, chemistGroupUsernames);
    }

    @Test
    public void testFilterOlderAgeUsers(){
        int ageLimit = 49;
        List<User> expectedList = UsersManager.filterOlderAgeUsers(ageLimit);
        List<User> olderAgeUsers = UsersManager.filterOlderAgeUsers(ageLimit)
                .stream()
                .filter(user -> ageLimit < user.getAge())
                .collect(Collectors.toList());

        assertEquals(expectedList.size(), olderAgeUsers.size());
    }

    @Test
    public void testFilterUsersWithoutPostsUsernames(){
        List<String> UsersWithoutPostsUsernames = UsersManager.filterUsersWithoutPostsUsernames();
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Jessie Pinkman");
        expectedList.add("Tuco Salamanca");
        expectedList.add("Gale Boetticher");
        assertEquals(expectedList, UsersWithoutPostsUsernames);
    }
}
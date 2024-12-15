package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    public static List<User> getUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 39, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 40, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        return users;
    }

    @Test
    public void countOnlyUsersOverOrExactly40(){
        double avg = ForumStats.getAverageNumberOfPostsForUsersOver40(ForumStatsTest.getUsersList());
        double expectedAvg = 2.25;
        assertEquals(avg, expectedAvg);
    }

    @Test
    public void countOnlyUsersUnder40(){
        double avg = ForumStats.getAverageNumberOfPostsForUsersUnder40(ForumStatsTest.getUsersList());
        double expectedAvg = 2382.0;
        assertEquals(avg, expectedAvg);
    }

}
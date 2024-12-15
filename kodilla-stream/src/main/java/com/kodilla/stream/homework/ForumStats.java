package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static void main(String[] args) {
        System.out.println(ForumStats.getAverageNumberOfPostsForUsersOver40(UsersRepository.getUsersList()));
        System.out.println(ForumStats.getAverageNumberOfPostsForUsersUnder40(UsersRepository.getUsersList()));
    }

    public static double getAverageNumberOfPostsForUsersOver40(List<User> users){
        double avg = users
                .stream()
                .filter(u -> 40 <= u.getAge())
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }

    public static double getAverageNumberOfPostsForUsersUnder40(List<User> users){
        double avg = users
                .stream()
                .filter(u -> 40 > u.getAge())
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }
}

package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<User> chemistGroupUsernames = filterOlderAgeUsers(48);
        System.out.println(chemistGroupUsernames);
    }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<String> getFilterChemistGroupUsernames(){
        return filterChemistGroupUsernames();
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> filterOlderAgeUsers(int age){
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> age < user.getAge())
                .collect(Collectors.toList());

        return users;
    }

    public static List<String> filterUsersWithoutPostsUsernames(){
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> 0 < user.getNumberOfPost())
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }
}
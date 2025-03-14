package com.kodilla.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.AbstractMap;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.sql.SQLException;

class DbManagerTestSuite {
    private static DbManager dbManager;

    @BeforeAll
    public static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnect() {
        //Given
        //When
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getResultsCount(rs);
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
            new AbstractMap.SimpleEntry<>("Otman", "Use"),
            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
    );

    private void insertUsers(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
            statement.executeUpdate(
                    String.format("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('%s', '%s')",
                            user.getKey(),
                            user.getValue()
                    )
            );
        }
    }

    private static int getResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while(rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }

    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException{
        //Given

        String countQuery = "SELECT U.ID, U.FIRSTNAME, U.LASTNAME\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) > 1;";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getResultsCount(rs);
        insertUsers(statement);
        insertPosts(statement);

        //When
        String sqlQuery = "SELECT U.ID, U.FIRSTNAME, U.LASTNAME\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) > 1;";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getResultsCount(rs);
        int expected = count + 1;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }



    private void insertPosts(Statement statement) throws SQLException {

        String lessThenTwoPostCountQuery = "SELECT U.ID, U.FIRSTNAME, U.LASTNAME\n" +
                "FROM USERS U\n" +
                "LEFT JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY U.ID\n" +
                "HAVING COUNT(P.ID) < 2;";
        statement = createStatement();
        ResultSet rs = statement.executeQuery(lessThenTwoPostCountQuery);
        String lessThenTwoPostId = getFirtResultId(rs);

        List<AbstractMap.SimpleEntry<String, String>> POSTS = List.of(
                new AbstractMap.SimpleEntry<>(lessThenTwoPostId, "Test post 1"),
                new AbstractMap.SimpleEntry<>(lessThenTwoPostId, "Test post 2")

        );

        for (AbstractMap.SimpleEntry<String, String> posts : POSTS) {
            statement.executeUpdate(
                    String.format("INSERT INTO POSTS(USER_ID, BODY) VALUES ('%s', '%s')",
                            posts.getKey(),
                            posts.getValue()
                    )
            );
        }
    }

    private static String getFirtResultId(ResultSet rs) throws SQLException {
        if (rs.next()) {
            int identyfikator = rs.getInt("ID");
            return String.valueOf(identyfikator);
        }
        return "No id in Result Set";
    }


}

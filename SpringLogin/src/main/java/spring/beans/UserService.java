package spring.beans;

import java.sql.SQLException;

/**
 *
 * @author Anghel Leonard
 */
public interface UserService {

    public boolean isValidUser(String username, String password) throws SQLException;
}

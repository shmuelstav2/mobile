package com.mobile.domain;

/**
 * Created by olyjosh on 19/05/2018.
 */
public class User {

    //Create this model with @Entity anotation to avoid creating a Table on the remote database
    // since I'm not sure there is any such table for this. You said you add users yourself
    // You can add entity -tablename, colum name among other anotation and repository as needed for User login

    private long id;
    private String username;
    private String password;


//    /**
//     * You likely don't need these constructors. As I only used them for implementing Basic authentications
//     */
//    public User(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }
//
//    /**
//     * You likely don't need these constructors. As I only used them for implementing Basic authentications
//     */
//    public User() {
//    }
//

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

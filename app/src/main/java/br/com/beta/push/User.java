package br.com.beta.push;

import com.parse.GetCallback;
import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

/**
 * Created by renan on 31/07/16.
 */

@ParseClassName("_User")
public class User extends ParseUser {
    public static final String NICK_NAME = "nickname";
    public static final String EMAIL = "nickname";
    private static final String OBJECT_ID = "objectId";

    public void setNickName(String nickname) {
        put(NICK_NAME, nickname);
    }

    public void setEmail(String email) {
        put(EMAIL, email);
    }

    public String getNickname() {
        if (getString(NICK_NAME) != null) {
            return getString(NICK_NAME);
        } else {
            return "";
        }
    }

    public static User getUser() {
        return (User) getCurrentUser();
    }

    public static void getById(String objectId, GetCallback<User> callback){
        ParseQuery.getQuery(User.class).whereEqualTo(OBJECT_ID, objectId).getFirstInBackground(callback);
    }
}

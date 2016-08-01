package br.com.beta.push;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParsePush;
import com.parse.PushService;
import com.parse.SaveCallback;


/**
 * Created by renansantos on 10/09/15.
 */
public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initParse();
    }

    private void initParse() {
        ParseObject.registerSubclass(User.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("br.com.beta.push")
                .clientKey("888")
                .server("http://192.168.0.101:1337/parse/").build());

    }

}

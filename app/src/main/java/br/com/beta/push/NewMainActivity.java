package br.com.beta.push;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.SaveCallback;

public class NewMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }

}

package com.imkalpit.firsttestproject.testproject1;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class FirstActivity extends Activity implements View.OnClickListener {

    int myButtonIds[] = {
            R.id.theCatButton,
            R.id.thing1button,
            R.id.thing2button,
            R.id.jiggerbutton,
            R.id.sallybutton,
            R.id.nickButton,
            R.id.drSbutton
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        for (int i = 0; i < myButtonIds.length; i++) {
            ((Button) findViewById(myButtonIds[i])).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "You have clicked on " + ((Button) view).getText().toString(), Toast.LENGTH_LONG).show();
    }
}

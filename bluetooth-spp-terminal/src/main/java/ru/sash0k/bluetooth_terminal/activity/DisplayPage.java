package ru.sash0k.bluetooth_terminal.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import ru.sash0k.bluetooth_terminal.R;

/**
 * Created by user on 10/12/2015.
 */
public class DisplayPage extends Activity {

    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.display_page);

        display= (TextView) findViewById(R.id.log_display);
    }
}

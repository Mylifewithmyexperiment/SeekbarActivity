package com.wordpress.sjatyourservice.seekbaractivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
   TextView tv1;
    SeekBar s1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.textView1);
        s1=(SeekBar)findViewById(R.id.seekBar1);

        s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                tv1.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {
                Toast.makeText(MainActivity.this, "start", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {
                Toast.makeText(MainActivity.this, "stop", Toast.LENGTH_SHORT).show();

            }
        });  //end of Statement

    }
}

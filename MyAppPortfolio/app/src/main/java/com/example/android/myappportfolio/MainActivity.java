
package com.example.android.myappportfolio;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }
@Override
    public void onClick(View v) {
    int id = v.getId();
        final String text;


        switch (id) {
            case R.id.button1:
                findViewById(R.id.button1);
                text = "This button will launch Spotify Streamer app";
                break;
            case R.id.button2:
                findViewById(R.id.button2);
                text = "This button will launch Scores app";
                break;
            case R.id.button3:
                findViewById(R.id.button3);
                text = "This button will launch Library app";
                break;
            case R.id.button4:
                findViewById(R.id.button4);
                text = "This button will launch Build It Bigger app";
                break;
            case R.id.button5:
                findViewById(R.id.button5);
                text = "This button will launch Bacon Reader app";
                break;
            case R.id.button6:
                findViewById(R.id.button6);
                text = "This button will launch Capstone app";
                break;
            default:
                findViewById(R.id.button1);

                text = null;
        }
    Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
    }
}

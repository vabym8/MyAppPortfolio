package me.abymathew.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSpotifyStreamer, btnScoresApp, btnLibraryApp, btnBuildItBigger, btnXYZReader, btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnSpotifyStreamer = (Button) findViewById(R.id.btn_Spotify_Streamer);
        btnScoresApp = (Button) findViewById(R.id.btn_Scores_App);
        btnLibraryApp = (Button) findViewById(R.id.btn_Library_App);
        btnBuildItBigger = (Button) findViewById(R.id.btn_Build_It_Bigger);
        btnXYZReader = (Button) findViewById(R.id.btn_XYZ_Reader);
        btnCapstone = (Button) findViewById(R.id.btn_Capstone);

        btnSpotifyStreamer.setOnClickListener(this);
        btnScoresApp.setOnClickListener(this);
        btnLibraryApp.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnXYZReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_Spotify_Streamer:
                toast("This button will launch Spotify Streamer App");
                break;
            case R.id.btn_Scores_App:
                toast("This button will launch Scores App");
                break;
            case R.id.btn_Library_App:
                toast("This button will launch Library App");
                break;
            case R.id.btn_Build_It_Bigger:
                toast("This button will launch Build It Bigger App");
                break;
            case R.id.btn_XYZ_Reader:
                toast("This button will launch XYZ Reader App");
                break;
            case R.id.btn_Capstone:
                toast("This button will launch Capstone App");
                break;
        }
    }

    public void toast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}

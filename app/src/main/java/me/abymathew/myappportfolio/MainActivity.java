package me.abymathew.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.btn_Spotify_Streamer)
    Button btnSpotifyStreamer;
    @Bind(R.id.btn_Scores_App)
    Button btnScoresApp;
    @Bind(R.id.btn_Library_App)
    Button btnLibraryApp;
    @Bind(R.id.btn_Build_It_Bigger)
    Button btnBuildItBigger;
    @Bind(R.id.btn_XYZ_Reader)
    Button btnXYZReader;
    @Bind(R.id.btn_Capstone)
    Button btnCapstone;

    @OnClick(R.id.btn_Spotify_Streamer)
    public void Spotify_Streamer() {
        toast("This button will launch Spotify Streamer App");
    }

    @OnClick(R.id.btn_Scores_App)
    public void Scores_App() {
        toast("This button will launch Scores App");
    }

    @OnClick(R.id.btn_Library_App)
    public void Library_App() {
        toast("This button will launch Library App");
    }

    @OnClick(R.id.btn_Build_It_Bigger)
    public void Build_It_Bigger() {
        toast("This button will launch Build It Bigger App");
    }

    @OnClick(R.id.btn_XYZ_Reader)
    public void XYZ_Reader() {
        toast("This button will launch XYZ Reader App");
    }

    @OnClick(R.id.btn_Capstone)
    public void Capstone() {
        toast("This button will launch Capstone App");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }

    public void toast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}

package tech.hyperdev.scorekeeper.activities;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.fragments.ScoreFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoreFragment scoreFragmentA = new ScoreFragment();
        ScoreFragment scoreFragmentB = new ScoreFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_1,scoreFragmentA).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_2,scoreFragmentB).commit();

    }
}

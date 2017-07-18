package tech.hyperdev.scorekeeper.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.fragments.ScoreFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoreFragment scoreFragmentA = ScoreFragment.newInstance("TEAM 1");
        ScoreFragment scoreFragmentB = ScoreFragment.newInstance("TEAM 2");

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_1,scoreFragmentA).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_2,scoreFragmentB).commit();

    }
}

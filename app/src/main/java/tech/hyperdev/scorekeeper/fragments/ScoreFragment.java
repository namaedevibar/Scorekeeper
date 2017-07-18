package tech.hyperdev.scorekeeper.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import tech.hyperdev.scorekeeper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScoreFragment extends Fragment implements View.OnClickListener {

    public ScoreFragment() {
        // Required empty public constructor
    }

    public static ScoreFragment newInstance(String name) {

        Bundle args = new Bundle();
        args.putString("TEAM_NAME",name);

        ScoreFragment fragment = new ScoreFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private TextView tvTeamName;
    private TextView tvScore;
    private ImageButton btnPlus;
    private ImageButton btnSubtract;
    String teamName;
    Integer score = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_score, container, false);
        tvTeamName = (TextView) view.findViewById(R.id.tvTeamName);
        tvScore = (TextView) view.findViewById(R.id.tvScore);
        btnPlus = (ImageButton) view.findViewById(R.id.btnPlus);
        btnSubtract = (ImageButton) view.findViewById(R.id.btnMinus);

        Bundle bundle = getArguments();

        teamName = bundle.getString("TEAM_NAME");
        tvTeamName.setText(teamName);

        btnPlus.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnPlus:
                score++;
                tvScore.setText(score+"");
                break;
            case R.id.btnMinus:
                score--;
                tvScore.setText(score+"");
                break;
        }
    }
}

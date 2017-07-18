package tech.hyperdev.scorekeeper.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import tech.hyperdev.scorekeeper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScoreFragment extends Fragment {

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
    String teamName;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_score, container, false);
        tvTeamName = (TextView) view.findViewById(R.id.tvTeamName);

        Bundle bundle = getArguments();

        teamName = bundle.getString("TEAM_NAME");
        tvTeamName.setText(teamName);


        return view;
    }

}

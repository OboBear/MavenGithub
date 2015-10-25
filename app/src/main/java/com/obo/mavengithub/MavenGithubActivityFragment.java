package com.obo.mavengithub;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.obo.githubmavenlib.GithubMavenTest;

/**
 * A placeholder fragment containing a simple view.
 */
public class MavenGithubActivityFragment extends Fragment {

    TextView textView;

    public MavenGithubActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_maven_github, container, false);
        textView = (TextView) contentView.findViewById(R.id.textView);
        textView.setText(GithubMavenTest.valueString);
        return contentView;
    }






}

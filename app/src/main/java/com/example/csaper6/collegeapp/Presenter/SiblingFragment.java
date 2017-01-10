package com.example.csaper6.collegeapp.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.csaper6.collegeapp.Model.Sibling;
import com.example.csaper6.collegeapp.R;

/**
 * Created by csaper6 on 12/9/16.
 */
public class SiblingFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_sibling, container, false);
        TextView fName = (TextView) rootView.findViewById(R.id.sibling_first_text_field);
        TextView lName = (TextView) rootView.findViewById(R.id.sibling_last_text_field);
        TextView age = (TextView) rootView.findViewById(R.id.sibling_first_text_field);
        TextView relation = (TextView) rootView.findViewById(R.id.sibling_relation_text_field);

        Sibling s = new Sibling();
        fName.setText(s.getfName());
        lName.setText(s.gelNname());
        relation.setText(s.getRelationship());
        age.setText(s.getAge());
        return rootView;
    }
}
package com.example.csaper6.collegeapp.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.csaper6.collegeapp.Model.Guardian;
import com.example.csaper6.collegeapp.R;

/**
 * Created by csaper6 on 12/9/16.
 */
public class GuardianFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_guardian, container, false);
        EditText fName = (EditText) rootView.findViewById(R.id.guardian_first_text_field);
        EditText lName = (EditText) rootView.findViewById(R.id.guardian_last_text_field);
        EditText occupation = (EditText) rootView.findViewById(R.id.guardian_occ_text_field);
        EditText relation = (EditText) rootView.findViewById(R.id.guardian_relation_text_field);
        EditText age = (EditText) rootView.findViewById(R.id.guardian_age_text_field);
        
        //get info from model 
        Guardian g = new Guardian();
        //set fields
        fName.setText(g.getfName());
        lName.setText(g.gelNname());
        occupation.setText(g.getOccupation());
        relation.setText(g.getRelationship());
        age.setText("" + g.getAge());
        return rootView;
    }
}


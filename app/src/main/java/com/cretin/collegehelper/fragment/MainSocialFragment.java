package com.cretin.collegehelper.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cretin.collegehelper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainSocialFragment extends Fragment {


    public MainSocialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_social, container, false);
    }

}

package com.edrinesolomongmail.myapp_solo;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag2 extends Fragment {


    int getMenu(){return R.menu.my_menu;}

    public frag2() {
        // Required empty public constructor
    }

    public static final String EXTRA_DET = "these are pics showing the recent me, hop u dont miss me";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle(R.string.app_name);
        View view = inflater.inflate(R.layout.fragment_frag2, container, false);
        TextView t=(TextView)view.findViewById(R.id.display);



        return view;
    }


}

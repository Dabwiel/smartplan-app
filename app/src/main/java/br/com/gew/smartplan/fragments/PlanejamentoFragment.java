package br.com.gew.smartplan.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.gew.smartplan.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlanejamentoFragment extends Fragment {

    private static final String TAG = "PlanejamentoFragment";

    public PlanejamentoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_planejamento, container, false);
    }

}

package com.example.bionatal.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bionatal.R;

public class FreeConsultationFragment extends Fragment {
    private RecyclerView rvAccount;
    Context mcontext;
    public FreeConsultationFragment( Context mcontext) {
        this.mcontext =mcontext;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.free_consultation_fragment, container, false);
        return view;
    }
}

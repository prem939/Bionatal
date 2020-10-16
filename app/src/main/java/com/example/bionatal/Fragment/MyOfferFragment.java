package com.example.bionatal.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bionatal.R;

public class MyOfferFragment extends Fragment {
    private RecyclerView rvAccount;
    Context mcontext;
    public MyOfferFragment( Context mcontext) {
        this.mcontext =mcontext;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_offers_fragment, container, false);
        return view;
    }
}

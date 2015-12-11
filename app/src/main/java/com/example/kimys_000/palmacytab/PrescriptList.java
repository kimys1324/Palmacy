package com.example.kimys_000.palmacytab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kimys_000 on 2015-11-09.
 */
public class PrescriptList extends Fragment {

    Context mContext;

    public PrescriptList()
    {
        super();
    }
    @SuppressLint("ValidFragment")
    public PrescriptList(Context context)
    {
        this.mContext = context;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.prescriptlist, null);
        return v;
    }

}

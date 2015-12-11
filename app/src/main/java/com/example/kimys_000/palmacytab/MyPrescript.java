package com.example.kimys_000.palmacytab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by kimys_000 on 2015-11-09.
 */
public class MyPrescript extends Fragment {

    Context mContext;
    Image prescriptQR;  
    Button refreshQR;

    public MyPrescript()
    {
        super();
    }

    @SuppressLint("ValidFragment")
    public MyPrescript(Context context)
    {
        mContext = context;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.prescript,null);
        return v;
    }



}

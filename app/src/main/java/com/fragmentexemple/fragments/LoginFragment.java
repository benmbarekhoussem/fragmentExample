package com.fragmentexemple.fragments;



/**
 * Created by houss on 07/04/17.
 */



import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragmentexemple.R;

public class LoginFragment extends android.support.v4.app.Fragment {
public LoginFragment(){

}
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.log_in, container, false);

    }
}
package com.pocketasl.myapplication.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.pocketasl.myapplication.R;
import com.pocketasl.myapplication.ui.home.level11.Level11Activity;
import com.pocketasl.myapplication.ui.home.level11.Level12Activity;
import com.pocketasl.myapplication.ui.home.level11.Level13Activity;
import com.pocketasl.myapplication.ui.home.level11.alphabet.quizback;

public class HomeFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ProgressBar progressbar = (ProgressBar) view.findViewById(R.id.progress_bar);
        progressbar.setProgress(3);

        Button level1lesson1button = (Button) view.findViewById(R.id.level1lesson1button);
        level1lesson1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Level11Activity.class);
                startActivity(in);
            }
        });

        Button level1lesson2button = (Button) view.findViewById(R.id.level1lesson2button);
        level1lesson2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Level12Activity.class);
                startActivity(in);
            }
        });

        Button level1lesson3button = (Button) view.findViewById(R.id.level1lesson3button);
        level1lesson3button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Level13Activity.class);
                startActivity(in);
            }
        });




        //Button quizback = (Button) view.findViewById(R.id.quizback);
        //quizback.setOnClickListener(new View.OnClickListener(){
        //    @Override
         //   public void onClick(View v){
         //       progress_bar.incrementProgressBy(1);
         //   }
       // });

        return view;

    }
}

//private HomeViewModel homeViewModel;
//
// homeViewModel =
//                new ViewModelProvider(this).get(HomeViewModel.class);
//
// final TextView textView = root.findViewById(R.id.welcome);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
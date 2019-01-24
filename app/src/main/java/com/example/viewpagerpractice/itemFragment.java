package com.example.viewpagerpractice;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class itemFragment extends Fragment {


    public static itemFragment newInstance(int position) {  //반복되는 코드를 재사용하여 뷰페이저를 최적화 하는 소스
        
        Bundle args = new Bundle();
        args.putInt("position",position);

        itemFragment fragment = new itemFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item,container,false);
        ImageView imageView = (ImageView)view.findViewById(R.id.item_imageview);
        imageView.setImageResource(getArguments().getInt("position"));
        return view;
    }
}

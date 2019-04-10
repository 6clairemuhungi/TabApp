package com.ann.tabapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    TextView txtResult;
    Button buttonHome;
    int counter=0;

    @BindView(R.id.txtResult2)
    TextView txtResult2;

    @BindView(R.id.imgOnline)
    ImageView imgOnline;

    int counter2 = 0;

    public HomeFragment() {
        // Required empty public constructor
    }

    @OnClick(R.id.buttonHome2)
    public void buttonClicked(){
        counter2++;
        txtResult2.setText(counter2+"");

        String url ="https://i.ebayimg.com/images/g/k5cAAOSwNSxVeEJv/s-l1600.jpg";

        Picasso.get().load(url).error(R.mipmap.ic_launcher_round).into(imgOnline);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_home,container,false);

        ButterKnife.bind(this,v);

        txtResult = v.findViewById(R.id.txtResult);
        buttonHome = v.findViewById(R.id.buttonHome);

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                txtResult.setText(counter+"");
            }
        });

        return v;
    }

}

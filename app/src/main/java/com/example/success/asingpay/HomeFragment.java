package com.example.success.asingpay;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import com.example.success.asingpay._sliders.FragmentSlider;
import com.example.success.asingpay._sliders.SliderIndicator;
import com.example.success.asingpay._sliders.SliderPagerAdapter;
import com.example.success.asingpay._sliders.SliderView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private SliderPagerAdapter mAdapter;
    private SliderIndicator mIndicator;

    private SliderView sliderView;
    private LinearLayout mLinearLayout;
    private RelativeLayout menu1;
    private RelativeLayout menu2;
    private RelativeLayout menu3;
    private RelativeLayout menu4;
    private RelativeLayout menu5;
    private RelativeLayout menu6;



    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        // Inflate the layout for this fragment
        sliderView = (SliderView) rootView.findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);
        menu1 = (RelativeLayout) rootView.findViewById(R.id.menu1);
        menu2 = (RelativeLayout) rootView.findViewById(R.id.menu2);
        menu3 = (RelativeLayout) rootView.findViewById(R.id.menu3);
        menu4 = (RelativeLayout) rootView.findViewById(R.id.menu4);
        menu5 = (RelativeLayout) rootView.findViewById(R.id.menu5);
        menu6 = (RelativeLayout) rootView.findViewById(R.id.menu6);




        menu1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(), "Profile Dipilih", Toast.LENGTH_SHORT).show();;

                    Intent goPindah = new Intent(getActivity(), DrawerActivity.class);
                    startActivity(goPindah);
                }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Daftar Penghuni Dipilih", Toast.LENGTH_SHORT).show();;

                Intent goPindah2 = new Intent(getActivity(), DaftarPenghuniActivity.class);
                startActivity(goPindah2);
                }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Daftar Piket Dipilih", Toast.LENGTH_SHORT).show();;

                Intent goPindah3 = new Intent(getActivity(), StrukturActivity.class);
                startActivity(goPindah3);
            }
        });

        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Struktur Kosan Dipilih", Toast.LENGTH_SHORT).show();;

                Intent goPindah4 = new Intent(getActivity(), StrukturActivity.class);
                startActivity(goPindah4);
            }
        });
        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Daftar Penghuni Baru Dipilih", Toast.LENGTH_SHORT).show();;

                Intent goPindah5 = new Intent(getActivity(), PenghuniBaruActivity.class);
                startActivity(goPindah5);
            }
        });

        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Daftar Kamar Kosong Dipilih", Toast.LENGTH_SHORT).show();;

                Intent goPindah6 = new Intent(getActivity(), KamarKosongActivity.class);
                startActivity(goPindah6);
            }
        });





        setupSliderofline();
        return rootView;

    }



//    private void setupSlider() {
//        sliderView.setDurationScroll(800);
//        List<Fragment> fragments = new ArrayList<>();
//        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-1.jpg"));
//        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-2.jpg"));
//        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-3.jpg"));
//        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-4.jpg"));
//
//        mAdapter = new SliderPagerAdapter(getFragmentManager(), fragments);
//        sliderView.setAdapter(mAdapter);
//        mIndicator = new SliderIndicator(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
//        mIndicator.setPageCount(fragments.size());
//        mIndicator.show();
//    }

    private void setupSliderofline() {
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(FragmentSlider.newInstance("image_slider_1"));
        fragments.add(FragmentSlider.newInstance("image_slider_1"));
        fragments.add(FragmentSlider.newInstance("image_slider_1"));
        fragments.add(FragmentSlider.newInstance("image_slider_1"));

        mAdapter = new SliderPagerAdapter(getFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        mIndicator = new SliderIndicator(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }

}

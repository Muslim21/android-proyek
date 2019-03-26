package com.example.success.asingpay.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.success.asingpay.Model.ModelData;
import com.example.success.asingpay.R;

import java.util.ArrayList;

/**
 * Created by JhonDev on 07/10/2016.
 */

public class ListArrayAdapter extends ArrayAdapter<ModelData> {

    private ArrayList<ModelData> list;
    private LayoutInflater inflater;
    private int res;

    public ListArrayAdapter(Context context, int resource, ArrayList<ModelData> list) {
        super(context, resource, list);
        this.list = list;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.res = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        MyHolder holder = null;


        if (convertView == null) {

            convertView = inflater.inflate(res, parent, false);

            holder = new MyHolder();

            holder.id = (TextView) convertView.findViewById(R.id.listID);
            holder.nama = (TextView) convertView.findViewById(R.id.listNama);
            holder.alamat = (TextView) convertView.findViewById(R.id.listAlamat);
            holder.nm_orangtua = (TextView) convertView.findViewById(R.id.listNamaOrangtua);
            holder.no_hp = (TextView) convertView.findViewById(R.id.listNoHp);
            holder.thn_masuk = (TextView) convertView.findViewById(R.id.listThnMasuk);
            holder.stats_masuk = (TextView) convertView.findViewById(R.id.listStatsMsk);
            holder.nm_kampus = (TextView) convertView.findViewById(R.id.listNamaKmpus);
            holder.photo = (ImageView) convertView.findViewById(R.id.imgpenghuni);

//            holder.Jenis = (TextView) convertView.findViewById(R.id.listJenisMhs);

            convertView.setTag(holder);

        } else {

            holder = (MyHolder) convertView.getTag();
        }

        holder.id.setText("Nomor Kamar  : "+list.get(position).getid());
        holder.nama.setText("Nama Penghuni : "+list.get(position).getNama());
        holder.alamat.setText("Alamat  : "+list.get(position).getAlamat());
        holder.nm_orangtua.setText("Nama Orangtua Penghuni : "+list.get(position).getNm_orangtua());
        holder.no_hp.setText("No Hp Orangtua : "+list.get(position).getNo_hp());
        holder.thn_masuk.setText("Tahun Masuk Penghuni : "+list.get(position).getThn_masuk());
        holder.stats_masuk.setText("Status Masuk Penghuni : "+list.get(position).getStats_masuk());
        holder.nm_kampus.setText("Nama Kampus Penghuni : "+list.get(position).getNm_kampus());
        Glide.with(getContext()).load(list.get(position).getPhoto()).into(holder.photo);


        return convertView;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public void remove(ModelData object) {
        super.remove(object);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    static class MyHolder {

        TextView id;
        TextView nama;
        TextView alamat;
        TextView nm_orangtua;
        TextView no_hp;
        TextView thn_masuk;
        TextView stats_masuk;
        TextView nm_kampus;
        ImageView photo;


    }
}

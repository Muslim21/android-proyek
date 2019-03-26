package com.example.success.asingpay._api;



import com.example.success.asingpay.Model.ModelData;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;
import retrofit2.http.FormUrlEncoded;
/**
 * Created by JhonDev on 05/10/2016.
 */

public interface ApiService {

    @FormUrlEncoded
    @POST("mahasiswa/login_orang_tua.php")
    Call<ResponseBody> Login(@Field("username") String username, @Field("password") String password);

    @FormUrlEncoded
    @POST("edit_data.php")
    Call<ResponseBody> editData(@Field("id_barang") String id, @Field("nama_barang") String nama, @Field("jenis_barang") String jenis, @Field("keterangan_barang") String keterangan);

    @FormUrlEncoded
    @POST("hapus_data.php")
    Call<ResponseBody> hapusData(@Field("id_barang") String id_barang);




}

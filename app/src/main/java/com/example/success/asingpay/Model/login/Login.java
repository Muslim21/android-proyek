package com.example.success.asingpay.Model.login;


import com.google.gson.annotations.SerializedName;


public class Login{

	@SerializedName("nama")
	private String nama;

	@SerializedName("id_orang_tua")
	private String idOrangTua;

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setIdOrangTua(String idOrangTua){
		this.idOrangTua = idOrangTua;
	}

	public String getIdOrangTua(){
		return idOrangTua;
	}

	@Override
 	public String toString(){
		return 
			"Login{" + 
			"nama = '" + nama + '\'' + 
			",id_orang_tua = '" + idOrangTua + '\'' + 
			"}";
		}
}

package com.example.success.asingpay.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelData {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("nama")
    @Expose
    private String nama;

    @SerializedName("alamat")
    @Expose
    private String alamat;

    @SerializedName("nm_orangtua")
    @Expose
    private String nm_orangtua;

    @SerializedName("no_hp")
    @Expose
    private String no_hp;

    @SerializedName("thn_masuk")
    @Expose
    private String thn_masuk;

    @SerializedName("stats_masuk")
    @Expose
    private String stats_masuk;

    @SerializedName("nm_kampus")
    @Expose
    private String nm_kampus;

    @SerializedName("photo")
    @Expose
    private String photo;

//    public static final String id_mahasiswa = "ID_MAHASISWA";
//    public static final String nama_mahasiswa = "ID_MAHASISWA";
//    public static final String jenis_mahasiswa = "ID_MAHASISWA";

    public ModelData(String id, String nama, String alamat, String nm_orangtua, String no_hp, String thn_masuk, String stats_masuk,
                     String nm_kampus, String photo) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.nm_orangtua = nm_orangtua;
        this.no_hp = no_hp;
        this.thn_masuk = thn_masuk;
        this.stats_masuk = stats_masuk;
        this.nm_kampus = nm_kampus;
        this.photo = photo;
    }

    /**
     * 
     * @return
     *     The idMahasiswa
     */
    public String getid() {
        return id;
    }

    /**
     * 
     * @param id
     *
     */
    public void setid(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * 
     * @param nama
     *     The Nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * 
     * @return
     *     The jenis
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     *
     * @param alamat
     *     The Jenis
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNm_orangtua() {
        return nm_orangtua;
    }

    /**
     *
     * @param nm_orangtua
     *     The Jenis
     */
    public void setNm_orangtua(String nm_orangtua) {
        this.nm_orangtua = nm_orangtua;
    }

    public String getNo_hp() {
        return no_hp;
    }

    /**
     *
     * @param no_hp
     *     The Jenis
     */
    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getThn_masuk() {
        return thn_masuk;
    }

    /**
     *
     * @param thn_masuk
     *     The Jenis
     */
    public void setThn_masuk(String thn_masuk) {
        this.thn_masuk = thn_masuk;
    }

    public String getStats_masuk() {
        return stats_masuk;
    }

    /**
     *
     * @param stats_masuk
     *     The Jenis
     */
    public void setStats_masuk(String stats_masuk) {
        this.stats_masuk = stats_masuk;
    }

    public String getNm_kampus() {
        return nm_kampus;
    }

    /**
     *
     * @param nm_kampus
     *     The Jenis
     */
    public void setNm_kampus(String nm_kampus) {
        this.nm_kampus = nm_kampus;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}

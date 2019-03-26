package com.example.success.asingpay;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.example.success.asingpay.Model.login.Login;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.inuser)
    EditText inuser;
    @BindView(R.id.inpass)
    EditText inpass;
    @BindView(R.id.btnDaftar)
    Button btnDaftar;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.relativeLayout)
    RelativeLayout relativeLayout;
    @BindView(R.id.user_profile_photo)
    ImageButton userProfilePhoto;
    @BindView(R.id.login_title)
    TextView loginTitle;

    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        btnDaftar.setOnClickListener(this);
        btnLogin.setOnClickListener(this);

        dialog = new ProgressDialog(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btnDaftar) {
            Intent i = new Intent(LoginActivity.this, DaftarActivity.class);
            startActivity(i);
        } else  if (view == btnLogin) {
            doLogin();
        }

    }

    private void doLogin() {
        dialog.setMessage("Loading . .");
        dialog.setCancelable(false);
        dialog.show();

        String username = inuser.getText().toString();
        String password = inpass.getText().toString();

        AndroidNetworking.post("localhost/mahasiswa/login_orang_tua.php")
                .addBodyParameter("username", username)
                .addBodyParameter("password", password)
                .doNotCacheResponse()
                .setPriority(Priority.HIGH)
                .setTag("test")
                .build()
                .getAsObject(Login.class, new ParsedRequestListener<Login>() {
                    @Override
                    public void onResponse(Login user) {
                        // do anything with response
                        dialog.dismiss();

                        SPManager.saveString(LoginActivity.this,"nama",user.getNama());
                        SPManager.saveString(LoginActivity.this,"id_orang_tua",user.getIdOrangTua());
                        Log.d("masuk",user.toString());
                        Intent i = new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(i);
                        finish();


                    }
                    @Override
                    public void onError(ANError error) {
                        // handle error
                        dialog.dismiss();
                        Log.d("gagal",error.toString());
                        Toast.makeText(LoginActivity.this,"gagal",Toast.LENGTH_SHORT).show();
                    }
                });

    }

}
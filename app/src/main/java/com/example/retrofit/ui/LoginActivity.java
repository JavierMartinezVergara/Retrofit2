package com.example.retrofit.ui;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofit.R;
import com.example.retrofit.api.model.Autentication;
import com.example.retrofit.api.model.AutenticationJde;
import com.example.retrofit.api.service.GitHubClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText usernameEditText = findViewById(R.id.user_id);
        final EditText passwordEditText = findViewById(R.id.password);
        final Button loginButton = findViewById(R.id.sign);





        loginButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Retrofit.Builder builder = new Retrofit.Builder()
                        //.baseUrl("https://ta5.wms.ocs.oraclecloud.com:443/")
                        .baseUrl("http://201.149.35.59:98/")
                        .addConverterFactory(GsonConverterFactory.create());

                Retrofit retrofit = builder.build();

                GitHubClient aut = retrofit.create(GitHubClient.class);
                //String base = usernameEditText.getText() + ":" + passwordEditText.getText();
                //String autHeader = "Basic " + android.util.Base64.encodeToString(base.getBytes(),Base64.NO_WRAP);

                AutenticationJde jde = new AutenticationJde(usernameEditText.getText().toString(),passwordEditText.getText().toString(), "JPY920", "*ALL", "Tester");



                Call<AutenticationJde> call =aut.getServer(jde);

                call.enqueue(new Callback<AutenticationJde>() {
                    @Override
                    public void onResponse(Call<AutenticationJde> call, Response<AutenticationJde> response) {
                        Context context;
                        AutenticationJde au;
                        String men, token = null;
                        if(response.isSuccessful()){
                                au= response.body();

                                men = au.getUserInfo().getAlphaname();
                            token = au.getUserInfo().getToken();




                            context = getApplicationContext();
                             Toast toast = Toast.makeText(LoginActivity.this, "Bienvenido "+ men, Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();


                            Intent intent;
                            intent = new Intent(LoginActivity.this, MainActivity.class);
                            intent.putExtra("Mensaje",token);
                            intent.putExtra("Username",men);

                            startActivity(intent);



                        }else{

                                context = getApplicationContext();
                                Toast toast = Toast.makeText(LoginActivity.this, "Usuario/Password Invalidos!", Toast.LENGTH_LONG);
                                toast.setGravity(Gravity.CENTER,0,0);
                                toast.show();



                        }








                        int code = response.code();




                    }

                    @Override
                    public void onFailure(Call<AutenticationJde> call, Throwable t) {

                    }
                });





            }
        });
    }

}

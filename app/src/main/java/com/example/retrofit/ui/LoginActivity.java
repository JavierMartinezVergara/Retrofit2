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
                        .baseUrl("https://ta5.wms.ocs.oraclecloud.com:443/")
                        .addConverterFactory(GsonConverterFactory.create());

                Retrofit retrofit = builder.build();

                GitHubClient aut = retrofit.create(GitHubClient.class);
                String base = usernameEditText.getText() + ":" + passwordEditText.getText();
                String autHeader = "Basic " + android.util.Base64.encodeToString(base.getBytes(),Base64.NO_WRAP);

                Call<Autentication> call =aut.getActi(autHeader);

                call.enqueue(new Callback<Autentication>() {
                    @Override
                    public void onResponse(Call<Autentication> call, Response<Autentication> response) {
                        Context context;
                        Autentication au;
                        String men = null;
                        if(response.isSuccessful()){
                                au= response.body();

                                men = au.getAction_code();


                            context = getApplicationContext();
                            Intent intent;
                            intent = new Intent(LoginActivity.this, MainActivity.class);
                            intent.putExtra("Mensaje",men);
                            startActivity(intent);



                        }else{
                            if(response.code()==401){
                                context = getApplicationContext();
                                Toast toast = Toast.makeText(LoginActivity.this, "Usuario/Password Invalidos!", Toast.LENGTH_LONG);
                                toast.setGravity(Gravity.CENTER,0,0);
                                toast.show();


                                ;
                            }
                        }








                        int code = response.code();

                        Log.d("LoginActivity", String.valueOf(men));
                        Log.d("LoginActivity", String.valueOf(code));


                    }

                    @Override
                    public void onFailure(Call<Autentication> call, Throwable t) {

                    }
                });





            }
        });
    }

}

package com.example.retrofit.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofit.R;
import com.example.retrofit.api.model.F41021.Condition;
import com.example.retrofit.api.model.F41021.F41021;
import com.example.retrofit.api.model.F41021.Query;
import com.example.retrofit.api.model.F41021.Value;
import com.example.retrofit.api.responses.DataBrowseF41021.ResponseF41021;

import com.example.retrofit.api.service.GitHubClient;
import com.example.retrofit.api.responses.DataBrowseF41021.Rowset;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    private RecyclerView recyclerView;

    private View voidView;

    private RecyclerViewAdapter recyclerViewAdaptador;

    String sss, as= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, AltaArticulo.class);

                startActivity(intent);


            }
        });


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        Intent intent =  getIntent();
        String s = (String) intent.getSerializableExtra("Username");



      //  TextView usrnameHeadder = findViewById(R.id.usrname);




        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        recyclerView = findViewById(R.id.list_contactos);
        voidView = findViewById(R.id.empty_state_container);
        recyclerViewAdaptador = new RecyclerViewAdapter(this, new ArrayList<Rowset>(0));




        recyclerViewAdaptador.setOnItemClickListener(new RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Rowset clickrowset) {

            }

            @Override
            public void onCancelAppointment(Rowset canceledRowset, int position) {

            }
        });

        recyclerView.setAdapter(recyclerViewAdaptador);


        SwipeRefreshLayout swipeRefreshLayout = findViewById(R.id.refresh_layout);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                cargaDatos();
            }
        });



    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);


        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {





        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    private void showAppointments(List<Rowset> serverAppointments) {
        recyclerViewAdaptador.swapItems(serverAppointments);

        recyclerView.setVisibility(View.VISIBLE);
        voidView.setVisibility(View.GONE);





    }



    @Override
    protected void onResume() {
        super.onResume();
        cargaDatos();
    }


    private void cargaDatos(){
        Intent intent =  getIntent();
        String s = (String) intent.getSerializableExtra("Mensaje");








        //  listView = (ListView) findViewById(R.id.pagina);


        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("http://201.149.35.59:98/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();



        GitHubClient client = retrofit.create(GitHubClient.class);

        //JsonObject jsonObject = new JsonObject();

        /*Ejemplo para FormActionRequest

        ArrayList<P0101FormAction> listFormActions = new ArrayList<P0101FormAction>();

        P0101FormAction p0101FormAction0 = new P0101FormAction("SetQBEValue","E","1[50]");

        P0101FormAction p0101FormAction1 = new P0101FormAction("SetControlValue","Al*","58");
        P0101FormAction p0101FormAction2 = new P0101FormAction("SetCheckboxValue","on","62");
        P0101FormAction p0101FormAction3 = new P0101FormAction("SetCheckboxValue","on","63");
        P0101FormAction p0101FormAction4 = new P0101FormAction("DoAction","15");

        listFormActions.add(0,p0101FormAction0);
        listFormActions.add(1,p0101FormAction1);
        listFormActions.add(2,p0101FormAction2);
        listFormActions.add(3,p0101FormAction3);
        listFormActions.add(4,p0101FormAction4);

        P0101 p0101 = new P0101("eenriquez",s,"ZJDE0001",listFormActions,"Tester","P01012_W01012B","1[19,20]" );



        */
        //
        ArrayList<Condition> conditions = new ArrayList<Condition>();
        ArrayList<Value> valuesarray = new ArrayList<Value>();
        Value valuequery = new Value("           1","LITERAL");


        valuesarray.add(0,valuequery);

        Condition conditionqueryf41021tablarequest = new Condition(valuesarray,"F41021.MCU", "EQUAL");
        conditions.add(0,conditionqueryf41021tablarequest);

        Query queryf41021tablarequest = new Query(true,conditions);

        F41021 f41021tablarequest = new F41021(s,"Tester","F41021","table","BROWSE","F41021.ITM|F41021.MCU|F41021.LOCN|F41021.LOTN",queryf41021tablarequest);












        Call<ResponseF41021> call = client.getTableF41021(f41021tablarequest);

        call.enqueue(new Callback<ResponseF41021>() {
            @Override
            public void onResponse(Call<ResponseF41021> call, Response<ResponseF41021> response) {
                List<Rowset> rowsets = response.body().getFsDATABROWSEF41021().getData().getGridData().getRowset();

                if(rowsets.size()>0){
                    showAppointments(rowsets);
                }


                /**for (ListIterator<Rowset> iter = rowsets.listIterator(); iter.hasNext(); ) {
                 Rowset element = iter.next();

                 sss= element.getSAlphaName20().getValue();


                 as = sss.concat(sss+as);









                 // 1 - can call methods of element
                 // 2 - can use iter.remove() to remove the current element from the list
                 // 3 - can use iter.add(...) to insert a new element into the list
                 //     between element and iter->next()
                 // 4 - can use iter.set(...) to replace the current element


                 }

                 Toast toast2 = Toast.makeText(MainActivity.this, sss, Toast.LENGTH_LONG);
                 toast2.setGravity(Gravity.CENTER,0,0);
                 toast2.show();

                 TextView text = findViewById(R.id.texttest);

                 text.setText(as);


                 */


                if(response.isSuccessful()){

                    showAppointments(rowsets);
                    //  Toast toast2 = Toast.makeText(MainActivity.this, response.body()., Toast.LENGTH_LONG);
                    // toast2.setGravity(Gravity.CENTER,0,0);
                    //toast2.show();


                }else if (response.code()!=200){
                    //   Toast toast2 = Toast.makeText(MainActivity.this, response.errorBody().toString(), Toast.LENGTH_LONG);
                    //  toast2.setGravity(Gravity.CENTER,0,0);
                    //    toast2.show();
                }







                //System.out.println(repos);





            }

            @Override
            public void onFailure(Call<ResponseF41021> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

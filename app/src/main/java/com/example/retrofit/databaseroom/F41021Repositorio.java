package com.example.retrofit.databaseroom;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.os.AsyncTask;

import com.example.retrofit.api.model.F41021.Condition;
import com.example.retrofit.api.model.F41021.F41021;
import com.example.retrofit.api.model.F41021.Query;
import com.example.retrofit.api.model.F41021.Value;
import com.example.retrofit.api.responses.DataBrowseF41021.ResponseF41021;
import com.example.retrofit.api.responses.DataBrowseF41021.Rowset;
import com.example.retrofit.api.service.GitHubClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class F41021Repositorio {


    private DAO_F41201 dao;
    private LiveData<List<DataEntityF41201>> listLiveDataF41021;

    private List<DataEntityF41201> datos;

    public F41021Repositorio(Application application ){
        DataBaseF41021 db = DataBaseF41021.getDataBaseF41021Instance(application);
        dao = db.dao_f41201();
        listLiveDataF41021 = dao.cargaConsulta();

    }



    public LiveData<List<DataEntityF41201>> cargaConsulta() {
        return listLiveDataF41021;
    }

    public void insert (DataEntityF41201 dataEntityF41201){
        new insertAsyncTask(dao).execute(dataEntityF41201);

    }


    private static class insertAsyncTask extends AsyncTask<DataEntityF41201,Void,Void>{

        private DAO_F41201 dataDAO;

        private insertAsyncTask(DAO_F41201 dao) {


            this.dataDAO = dao;
        }

        @Override
        protected Void doInBackground(final DataEntityF41201... dataEntityF41201s) {

            dataDAO.insert(dataEntityF41201s[0]);

            return null;
        }
    }




    private void getRecipesFromWeb(String token, String valueITM, String valueMCU){
      //  Timber.d("getRecipesFromWeb");

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

        ArrayList<Condition> conditions = new ArrayList<Condition>();
        ArrayList<Value> valuesarray = new ArrayList<Value>();
        ArrayList<Value> valuesarray1 = new ArrayList<Value>();
        ArrayList<Value> valuesarray2 = new ArrayList<Value>();








        Condition conditionqueryf41021tablarequest = new Condition(valuesarray,"F41021.MCU", "EQUAL");

        Condition conditionqueryf41021tablarequest1 = new Condition(valuesarray1,"F41021.ITM", "EQUAL");

        Condition conditionqueryf41021tablarequest2 = new Condition(valuesarray2,"F41021.PQOH", "NOT_EQUAL");
        Value valuequery = new Value(valueMCU,"LITERAL");
        valuesarray.add(0,valuequery);
        conditions.add(0,conditionqueryf41021tablarequest);
        Value valuequery1 = new Value(valueITM,"LITERAL");
        valuesarray1.add(0,valuequery1);
        conditions.add(1,conditionqueryf41021tablarequest1);

        Value valuequery2 = new Value("0","LITERAL");
        valuesarray2.add(0,valuequery2);

        conditions.add(2,conditionqueryf41021tablarequest2);

        Query queryf41021tablarequest = new Query(true,conditions);

        F41021 f41021tablarequest = new F41021(token,"Tester","F41021","table","BROWSE","F41021.ITM|F41021.MCU|F41021.LOCN|F41021.LOTN|F41021.PQOH",queryf41021tablarequest);












        Call<ResponseF41021> call = client.getTableF41021(f41021tablarequest);

        call.enqueue(new Callback<ResponseF41021>() {
            @Override
            public void onResponse(Call<ResponseF41021> call, Response<ResponseF41021> response) {


                if(response.isSuccessful()){
                    List<Rowset> rowsets = response.body().getFsDATABROWSEF41021().getData().getGridData().getRowset();


                    for (int i = 0; i < rowsets.size(); i++){
                        int ITM = rowsets.get(i).getF41021ITM();
                        String LOTN = rowsets.get(i).getF41021LOTN();
                        String LOCN = rowsets.get(i).getF41021LOCN();
                        String MCU = rowsets.get(i).getF41021MCU();
                        int pqoh = rowsets.get(i).getF41021PQOH();

                        DataEntityF41201 databasemodel = new DataEntityF41201(ITM,LOCN,LOTN,MCU,pqoh);

                        insert(databasemodel);


                        //addRecipesToDB(rowsets);




                    }

                    //showAppointments(rowsets);
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

            }
        });
    }




    private void addRecipesToDB(List<DataEntityF41201> items) {
        //Timber.d("addRecipesToDB");
        new AsyncTask<List<DataEntityF41201>, Void, Boolean>() {
            @Override
            protected Boolean doInBackground(List<DataEntityF41201>... params) {
                boolean needsUpdate = false;
                for (DataEntityF41201 item : params[0]) {
                    //upsert implementation for future use
                    dao.insert(item); //-1 if not inserted
                //    if (inserted == -1){
                        //int updated = recipesDAO.update(item);
                        //if (updated > 0){
                          //  needsUpdate = true;
                        //}
                  //  }else{
                    //    needsUpdate = true;
                    //}

                }
                return needsUpdate;
            }

            @Override
            protected void onPostExecute(Boolean needUpdate) {
                if (needUpdate) {
                    loadAllRecipesFromDB();
                }
            }
        }.execute(items);
    }

    private void loadAllRecipesFromDB() {
       // Timber.d("loadAllRecipesFromDB");
        new AsyncTask<Void, Void, List<DataEntityF41201>>() {
            @Override
            protected List<DataEntityF41201> doInBackground(Void...a) {
                return datos;
            }

            @Override
            protected void onPostExecute(List<DataEntityF41201> results) {
                //check if there are data in the db
                if ((results != null)&&results.size()>0) {

                    return;
                    // setRecipesListObservableData(results, null);
                }
            }
        }.execute();
    }

    public void fetchData(String token, String valorITM, String valorMCU){
        loadAllRecipesFromDB();
        getRecipesFromWeb(token,valorITM,valorMCU);
    }


}

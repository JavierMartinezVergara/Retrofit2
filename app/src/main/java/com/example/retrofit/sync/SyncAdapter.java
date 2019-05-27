package com.example.retrofit.sync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;

import com.example.retrofit.provider.ContractToF41021;

public class SyncAdapter extends AbstractThreadedSyncAdapter {

    private static final String TAG = SyncAdapter.class.getSimpleName();

    ContentResolver resolver;


    private static final String[] PROJECTION = new String[]{
            ContractToF41021.Columnas._ID,
            ContractToF41021.Columnas.F41021ITM,
            ContractToF41021.Columnas.F41021MCU,
            ContractToF41021.Columnas.F41021LOTN,
            ContractToF41021.Columnas.F41021LOTN,

    };

    // Indices para las columnas indicadas en la proyección
    public static final int COLUMNA_ID = 0;
    public static final int COLUMNA_ID_ITM = 1;
    public static final int COLUMNA_MCU = 2;
    public static final int COLUMNA_LOTN = 3;
    public static final int COLUMNA_LINT = 4;





    public SyncAdapter(Context context, boolean autoInitialize) {
        super(context, autoInitialize);

        resolver= context.getContentResolver();
    }

    public SyncAdapter(Context context, boolean autoInitialize, boolean allowParallelSyncs) {
        super(context, autoInitialize, allowParallelSyncs);

        resolver= context.getContentResolver();
    }

    @Override
    public void onPerformSync(Account account, Bundle bundle, String s, ContentProviderClient contentProviderClient, SyncResult syncResult) {



    }
}

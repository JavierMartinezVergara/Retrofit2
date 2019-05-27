package com.example.retrofit.provider;

import android.content.UriMatcher;
import android.net.Uri;
import android.provider.BaseColumns;

public class ContractToF41021 {
    /*
     * Autoridad del Content Provider
     */
    public final static String AUTHORITY
            = "com.example.retrofit";
    /**
     * Representación de la tabla a consultar
     */
    public static final String GASTO = "F41021";
    /**
     * Tipo MIME que retorna la consulta de una sola fila
     */
    public final static String SINGLE_MIME =
            "vnd.android.cursor.item/vnd." + AUTHORITY + GASTO;

    public final static String MULTIPLE_MIME =
            "vnd.android.cursor.dir/vnd." + AUTHORITY + GASTO;
    /**
     * URI de contenido principal
     */
    public final static Uri CONTENT_URI =
            Uri.parse("content://" + AUTHORITY + "/" + GASTO);
    /**
     * Comparador de URIs de contenido
     */
    public static final UriMatcher uriMatcher;
    /**
     * Código para URIs de multiples registros
     */
    public static final int ALLROWS = 1;
    /**
     * Código para URIS de un solo registro
     */
    public static final int SINGLE_ROW = 2;


    // Asignación de URIs
    static {
        uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        uriMatcher.addURI(AUTHORITY, GASTO, ALLROWS);
        uriMatcher.addURI(AUTHORITY, GASTO + "/#", SINGLE_ROW);
    }

    // Valores para la columna ESTADO
    public static final int ESTADO_OK = 0;
    public static final int ESTADO_SYNC = 1;


    /**
     * Estructura de la tabla
     */
    public static class Columnas implements BaseColumns {

        private Columnas() {
            // Sin instancias
        }

        public final static String F41021LOCN = "f41021LOCN";
        public final static String F41021LOTN = "f41021LOTN";
        public final static String F41021MCU = "f41021MCU";
        public final static String  F41021ITM = "f41021ITM";

        public static final String ESTADO = "estado";
        public final static String PENDIENTE_INSERCION = "pendiente_insercion";

    }
}

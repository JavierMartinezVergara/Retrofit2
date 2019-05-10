package com.example.retrofit.api.model;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class P0101 {



        @SerializedName("token")
        @Expose
        private String token;
        @SerializedName("version")
        @Expose
        private String version;
        @SerializedName("formActions")
        @Expose
        private List<P0101FormAction> formActions = null;
        @SerializedName("deviceName")
        @Expose
        private String deviceName;
        @SerializedName("formName")
        @Expose
        private String formName;
        @SerializedName("returnControlIDs")
        @Expose
        private String returnControlIDs;

        /**
         * No args constructor for use in serialization
         *
         */
        public P0101() {
        }

        /**
         *
         * @param deviceName
         * @param token
         * @param formName
         * @param returnControlIDs
         * @param formActions
         * @param version
         */
        public P0101(String token, String version, List<P0101FormAction> formActions, String deviceName, String formName, String returnControlIDs) {
            super();
            this.token = token;
            this.version = version;
            this.formActions = formActions;
            this.deviceName = deviceName;
            this.formName = formName;
            this.returnControlIDs = returnControlIDs;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public List<P0101FormAction> getFormActions() {
            return formActions;
        }

        public void setFormActions(List<P0101FormAction> formActions) {
            this.formActions = formActions;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }

        public String getFormName() {
            return formName;
        }

        public void setFormName(String formName) {
            this.formName = formName;
        }

        public String getReturnControlIDs() {
            return returnControlIDs;
        }

        public void setReturnControlIDs(String returnControlIDs) {
            this.returnControlIDs = returnControlIDs;
        }

    }

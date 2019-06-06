package com.example.retrofit.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.retrofit.R;
import com.example.retrofit.api.responses.DataBrowseF41021.Rowset;
import com.example.retrofit.databaseroom.DataEntityF41201;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<DataEntityF41201> rowsets;

    private Context mContext;

    private OnItemClickListener mOnItemClickListener;

     interface OnItemClickListener{

        void onItemClick(DataEntityF41201 clickrowset);

        void onCancelAppointment(DataEntityF41201 canceledRowset, int position);
    }


    public RecyclerViewAdapter(Context context, List<DataEntityF41201> items){
        rowsets= items;
        mContext = context;
    }

    public OnItemClickListener getOnItemClickListener() {
        return mOnItemClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.facility_cardview, parent, false);

        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder viewHolder, int i) {

        DataEntityF41201 rowsetData = rowsets.get(i);


        viewHolder.mcu.setText( rowsetData.getDataBf41021MCU());

        viewHolder.itm.setText(rowsetData.getDataBf41021LOCN());

        viewHolder.lotn.setText(rowsetData.getDataBf41021LOTN());

        viewHolder.locn.setText(rowsetData.getDataBf41021ITM().toString());

        viewHolder.pqor.setText(rowsetData.getDataBf4102PQOH().toString());




    }

    @Override
    public int getItemCount()

    {
        return rowsets.size();
    }


    public void swapItems(List<DataEntityF41201> rows) {
        if (rows == null) {
            rowsets = new ArrayList<>(0);
        } else {
            rowsets = rows;
        }
        notifyDataSetChanged();
    }



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView mcu;
        public TextView lotn;
        public TextView itm;
        public TextView locn;
        public TextView pqor;

        public Button cancelButton;
        public View statusIndicator;

        public ViewHolder(View itemView) {
            super(itemView);


            mcu =  itemView.findViewById(R.id.mcu);
            itm =  itemView.findViewById(R.id.itm);
            lotn =  itemView.findViewById(R.id.lotn);
            locn =  itemView.findViewById(R.id.locn);
            pqor = itemView.findViewById(R.id.pqor);


/*
            cancelButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        mOnItemClickListener.onCancelAppointment(rowsets.get(position), position);
                    }
                }
            });*/
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (position != RecyclerView.NO_POSITION) {
                mOnItemClickListener.onItemClick(rowsets.get(position));
            }
        }
    }



}



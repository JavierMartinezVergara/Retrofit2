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

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Rowset> rowsets;

    private Context mContext;

    private OnItemClickListener mOnItemClickListener;

     interface OnItemClickListener{

        void onItemClick(Rowset clickrowset);

        void onCancelAppointment(Rowset canceledRowset, int position);
    }


    public RecyclerViewAdapter(Context context, List<Rowset> items){
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

        Rowset rowsetData = rowsets.get(i);


        viewHolder.id.setText("AN: " +rowsetData.getF41021ITM());

        viewHolder.country.setText(rowsetData.getF41021LOCN());

        viewHolder.city.setText(rowsetData.getF41021MCU());




    }

    @Override
    public int getItemCount()

    {
        return rowsets.size();
    }


    public void swapItems(List<Rowset> rows) {
        if (rows == null) {
            rowsets = new ArrayList<>(0);
        } else {
            rowsets = rows;
        }
        notifyDataSetChanged();
    }



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView id;
        public TextView city;
        public TextView state;
        public TextView country;
        public Button cancelButton;
        public View statusIndicator;

        public ViewHolder(View itemView) {
            super(itemView);

            statusIndicator = itemView.findViewById(R.id.indicator_appointment_status);
            id =  itemView.findViewById(R.id.text_idfacility);
            city =  itemView.findViewById(R.id.text_city);
            state =  itemView.findViewById(R.id.text_state);
            country =  itemView.findViewById(R.id.text_country);
            cancelButton =  itemView.findViewById(R.id.button_cancel_appointment);

            cancelButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        mOnItemClickListener.onCancelAppointment(rowsets.get(position), position);
                    }
                }
            });
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



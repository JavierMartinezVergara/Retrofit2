package com.example.retrofit.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.retrofit.R;
import com.example.retrofit.api.model.FacilitiesModel;
import com.example.retrofit.api.model.Results;
import com.example.retrofit.ui.ItemFragment.OnListFragmentInteractionListener;
import com.example.retrofit.ui.dummy.DummyContent.DummyItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private List<FacilitiesModel> mItems;

    private Context mContext;

    private OnItemClickListener mOnItemClickListener;

    interface OnItemClickListener {

        void onItemClick(FacilitiesModel clickedAppointment);

        void onCancelAppointment(FacilitiesModel canceledAppointment, int position);

    }

    public MyItemRecyclerViewAdapter(List<FacilitiesModel> mItems, Context mContext) {
        this.mItems = mItems;
        this.mContext = mContext;
    }

    public OnItemClickListener getmOnItemClickListener() {
        return mOnItemClickListener;
    }

    public void setmOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.facility_cardview, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        FacilitiesModel results = mItems.get(position);

       // holder.

    }

    @Override
    public int getItemCount() {
        return 0;
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
            id = (TextView) itemView.findViewById(R.id.text_idfacility);
            city = (TextView) itemView.findViewById(R.id.text_city);
            state = (TextView) itemView.findViewById(R.id.text_state);
            country = (TextView) itemView.findViewById(R.id.text_country);
            cancelButton = (Button) itemView.findViewById(R.id.button_cancel_appointment);

            cancelButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        mOnItemClickListener.onCancelAppointment(mItems.get(position), position);
                    }
                }
            });
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (position != RecyclerView.NO_POSITION) {
                mOnItemClickListener.onItemClick(mItems.get(position));
            }
        }
    }


}



package com.example.retrofit.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.retrofit.R;
import com.example.retrofit.api.model.GitHubRepo;
import com.example.retrofit.api.model.Results;

import java.util.List;

public class GitHubRepoAdapter extends ArrayAdapter<Results>{

    private Context context;
    private Results values;

    public GitHubRepoAdapter(Context context, List<Results> values) {
        super(context, R.layout.list_item_paginacion, values);

        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_item_paginacion, parent, false);
        }

        TextView textView = (TextView) row.findViewById(R.id.list_item_pagination_text);

        GitHubRepo item = values.get(position);
        String message = item.getName();
        textView.setText(message);

        return row;
    }
}
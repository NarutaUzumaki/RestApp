package com.example.mobilerestaurant.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mobilerestaurant.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class newsAdapter extends RecyclerView.Adapter<newsAdapter.ViewHolder> {

    private List<NewsShower> newsList = new ArrayList<>();

    private TextView newsTextView;
//    private LayoutInflater mInflater;


    public void setItems(Collection<NewsShower> news){
        newsList.addAll(news);
        notifyDataSetChanged();
    }

    public void clearItems(){
        newsList.clear();
        notifyDataSetChanged();
    }

//    newsAdapter(List<HomeViewModel> data, Context context) {
//        this.mInflater = LayoutInflater.from(context);
//        this.newsList = data;
//    }

    @NonNull
    @Override
    public newsAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_row, viewGroup, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull newsAdapter.ViewHolder viewHolder, int i) {
        viewHolder.bind(newsList.get(i));
    }


    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView newsImageView;
        private TextView newsTextView;
//      Ссылка текстом на активити, о котором упоминает сама нововость
        private TextView newsLinkToActiityView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            ищет компоненты
            //newsImageView = itemView.findViewById(R.id.imageView);
            newsTextView = itemView.findViewById(R.id.recyclerView);
        }

        @Override
        public void onClick(View v) {

        }

        public void bind(NewsShower home){
            newsTextView.setText(home.getNewsTitle());
        }
    }
}
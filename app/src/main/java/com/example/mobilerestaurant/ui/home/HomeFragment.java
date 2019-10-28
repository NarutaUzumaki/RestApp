package com.example.mobilerestaurant.ui.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mobilerestaurant.R;
import com.example.mobilerestaurant.adapter.NewsShower;
import com.example.mobilerestaurant.adapter.newsAdapter;

import java.util.Arrays;
import java.util.Collection;

public class HomeFragment extends AppCompatActivity {

    private HomeViewModel homeViewModel;
    private RecyclerView newsRecyclerView;
    private newsAdapter newsAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);
        //        homeViewModel =
//                ViewModelProviders.of(this).get(HomeViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

//        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        initRecyclerView();
        loadNews();

        //return root;
    }

    private void initRecyclerView(){
        newsRecyclerView = findViewById(R.id.recycler_news_home);

        newsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        newsAdapter = new newsAdapter();
        newsRecyclerView.setAdapter(newsAdapter);
    }

    private void loadNews(){
        Collection<NewsShower> news = getNews();
        newsAdapter.setItems(news);
    }

    private Collection<NewsShower> getNews(){
        return Arrays.asList(
            new NewsShower("Hello this is our news list."),
                new NewsShower("Here we will show you all news and day's topics.")
        );
    }
}
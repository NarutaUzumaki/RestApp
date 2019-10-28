package com.example.mobilerestaurant.adapter;

public class NewsShower {
    private String newsTitle;
    private String newsText;
    private String newsLinkToActivity;

//    private RecyclerView newsRecyckerView;
//    private newsAdapter newsAdapter;


//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        initRecyclerView();
//    }

//    public void initRecyclerView(){
//        newsRecyckerView = findViewById(R.id.recycler_news_home);
//
//        newsRecyckerView.setLayoutManager(new LinearLayoutManager(this));
//
//        newsAdapter = new newsAdapter();
//        newsRecyckerView.setAdapter(newsAdapter);
//    }

    public NewsShower(String newsText){
    }

    public void setNewsTitle(String newsText){
        this.newsText = newsText;
    }

    public  String getNewsTitle(){
        return newsText;
    }



}

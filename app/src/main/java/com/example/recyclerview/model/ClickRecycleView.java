package com.example.recyclerview.model;

public interface ClickRecycleView {
    void onCustomClick(int position);

    void deletePeople(int position);

    void addAge(int position);

    void showMore(Object object, int position);
}
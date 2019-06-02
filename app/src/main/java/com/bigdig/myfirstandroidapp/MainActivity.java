package com.bigdig.myfirstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bigdig.myfirstandroidapp.model.BankCard;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        List<BankCard> bankCardList = new ArrayList<>();
        bankCardList.add(new BankCard("Anton Sakhniuk", "5168111100003333", 100, "", 1111));
        bankCardList.add(new BankCard("Vasya", "5168111100003333", 1000, "", 1111));
        bankCardList.add(new BankCard("Petya", "5168111100003333", 105, "", 1111));
        bankCardList.add(new BankCard("John Smith", "5168111108803333", 15, "", 1111));
        bankCardList.add(new BankCard("Katya", "5168111100004444", 500, "", 1111));
        bankCardList.add(new BankCard("Ira", "5168111106999983", 160, "", 1111));

        BankCardAdapter adapter = new BankCardAdapter(bankCardList);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        );
    }
}

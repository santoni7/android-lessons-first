package com.bigdig.myfirstandroidapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bigdig.myfirstandroidapp.model.BankCard;

import java.util.List;

public class BankCardAdapter extends RecyclerView.Adapter<BankCardViewHolder> {
    private List<BankCard> bankCardList;

    public BankCardAdapter(List<BankCard> bankCardList) {
        this.bankCardList = bankCardList;
    }

    @NonNull
    @Override
    public BankCardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_bank_card, viewGroup, false);

        return new BankCardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BankCardViewHolder bankCardViewHolder, int i) {
        BankCard bankCard = bankCardList.get(i);
        bankCardViewHolder.bind(bankCard);
    }

    @Override
    public int getItemCount() {
        return bankCardList.size();
    }
}

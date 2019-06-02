package com.bigdig.myfirstandroidapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.bigdig.myfirstandroidapp.model.BankCard;

public class BankCardViewHolder extends RecyclerView.ViewHolder {
    private TextView tvOwnerName;
    private TextView tvCardNumber;
    private TextView tvAmount;

    public BankCardViewHolder(@NonNull View itemView) {
        super(itemView);

        tvOwnerName = itemView.findViewById(R.id.tv_owner_name);
        tvCardNumber = itemView.findViewById(R.id.tv_card_number);
        tvAmount = itemView.findViewById(R.id.tv_amount);
    }

    public void bind(BankCard bankCard) {
        tvOwnerName.setText(bankCard.getOwnerName());
        tvCardNumber.setText(bankCard.getCardNumber());
        tvAmount.setText(String.valueOf(bankCard.getAmount()));
    }
}

package com.example.ourteam2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TeamViewHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView teamName;
    TextView teamID;

    // this item view is representing this whole xml file which is passed to this constructor
    public TeamViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
        teamName = itemView.findViewById(R.id.teamName);
        teamID = itemView.findViewById(R.id.teamID);
    }
}

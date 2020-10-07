package com.example.ourteam2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class TeamsAdapter extends RecyclerView.Adapter<TeamViewHolder> {

    ArrayList<Team> teams;

    public TeamsAdapter() {
        teams = new ArrayList<>();
    }

    public void setData(ArrayList<Team> teams){
        //sets the teams of the adapter to the passed parameter
        this.teams = teams;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //turning layout (xml) into a Java View object
        View teamView = layoutInflater.inflate(R.layout.recycler_ele,parent,false);
        return new TeamViewHolder(teamView);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        Team team = teams.get(position);
        Picasso.get().load(team.image).into(holder.image);
        holder.teamName.setText(team.teamName);
        holder.teamID.setText(team.teamID);
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }
}

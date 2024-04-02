package com.example.nationapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {


    private ArrayList<CountryModel> countrymodel;

    public CountryAdapter(ArrayList<CountryModel> countrymodel) {
        this.countrymodel = countrymodel;
    }

    @NonNull
    @Override
    public CountryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter.ViewHolder holder, int position) {
        holder.tvNamaNegara.setText(countrymodel.get(position).getNamaNegara());
        holder.ivGambarNegara.setImageResource(countrymodel.get(position).getGambarNegara());
        holder.tvInfoNegara.setText(countrymodel.get(position).getInfoNegara());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengambil posisi item yang diklik
                int position = holder.getAdapterPosition();

                // Mengambil data dari item yang diklik
                CountryModel country = countrymodel.get(position);

                // Membuat Intent untuk memulai DetailActivity dan mengirim data
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra("nama_negara", country.getNamaNegara());
                intent.putExtra("gambar_negara", country.getGambarNegara());
                intent.putExtra("info_negara", country.getInfoNegara());
                intent.putExtra("deskripsi_negara", country.getDeskripsiNegara()); // Menambahkan deskripsi_negara
                v.getContext().startActivity(intent);
            }
        });
    }



    @Override
    public int getItemCount() {
        return countrymodel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvNamaNegara, tvInfoNegara;
        ImageView ivGambarNegara;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNamaNegara = itemView.findViewById(R.id.tvNamaNegara);
            ivGambarNegara = itemView.findViewById(R.id.ivGambarNegara);
            tvInfoNegara = itemView.findViewById(R.id.tvInfoNegara);
        }
    }
}

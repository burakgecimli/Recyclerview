package com.bugcompany.kykyurtprojesi

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bugcompany.kykyurtprojesi.databinding.CardViewDesignBinding

class KykAdapter(var mContext: Context, var kykList: ArrayList<KykModel>) :
    RecyclerView.Adapter<KykAdapter.CardViewDesign>() {

    class CardViewDesign(val binding: CardViewDesignBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesign {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = CardViewDesignBinding.inflate(layoutInflater, parent, false)
        return CardViewDesign(binding)

    }

    override fun onBindViewHolder(holder: CardViewDesign, position: Int) {

        val kyk = kykList[position]
        holder.binding.textViewKyk.text = kyk.kykName
        holder.binding.imageViewKyk.setImageResource(kyk.kykImage)
        holder.binding.imageViewKyk.setOnClickListener {

            val intent = Intent(mContext, DetailsActivity::class.java)
            intent.putExtra("object", kyk)
            mContext.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return kykList.size
    }
}
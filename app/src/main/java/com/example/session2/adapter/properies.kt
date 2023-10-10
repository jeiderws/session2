package com.example.session2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.session2.databinding.ActivityMainBinding
import com.example.session2.databinding.ReutilazarBinding
import com.example.session2.databinding.Reutilizarx2Binding

class properiesadapter(var List : MutableList<String>):RecyclerView.Adapter<properiesadapter.Holder>()
{
    inner class Holder(var binding: ReutilazarBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return  Holder(ReutilazarBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int {
       return  List.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        List.apply {
            holder.binding.apply {

            }
        }
    }

}
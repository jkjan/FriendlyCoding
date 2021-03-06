package com.smu.friendlycoding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.smu.friendlycoding.databinding.ItemStageBinding
import com.smu.friendlycoding.viewmodel.SelectActViewModel

class SelectActAdapter(@LayoutRes val layoutID: Int, val mSelectActViewModel: SelectActViewModel) :
    RecyclerView.Adapter<SelectActAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding =
            DataBindingUtil.inflate<ItemStageBinding>(layoutInflater, viewType, parent, false)
        return Holder(binding)
    }

    override fun getItemCount() = mSelectActViewModel.list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(mSelectActViewModel, position)
    }

    override fun getItemViewType(position: Int): Int = getLayoutIdForPosition()

    private fun getLayoutIdForPosition(): Int = layoutID

    class Holder(val binding: ItemStageBinding) : RecyclerView.ViewHolder(binding.itemView) {
        fun bind(mSelectActViewModel: SelectActViewModel, position: Int) {
            binding.stageVM = mSelectActViewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }
}
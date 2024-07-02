package com.example.auto

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.example.auto.databinding.ItemFriendBinding

class FriendsHolder(
    private val glide: RequestManager,
    private val binding: ItemFriendBinding,
    private val onClick: (Person) -> Unit
) : ViewHolder(binding.root){
    fun onBind(person: Person) {
        binding.run {
            tvName.text = person.name
            tvDescription.text = person.shortDescription

            glide
                .load(person.imgUrl)
                .error(R.drawable.hero)
                .placeholder(R.drawable.baseline_sync_24)
                .into(ivImage)
            root.setOnClickListener{
                onClick(person)
            }
        }
    }
}
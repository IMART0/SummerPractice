package com.example.auto

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.auto.databinding.ItemFriendBinding

class FriendsAdapter(
    private val friends: List<Person>,
    private val glide: RequestManager,
    private val onClick: (Person) -> Unit
): RecyclerView.Adapter<FriendsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendsHolder {
        return FriendsHolder(
            binding = ItemFriendBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            glide = glide,
            onClick = onClick
        )
    }

    override fun getItemCount(): Int = friends.size

    override fun onBindViewHolder(holder: FriendsHolder, position: Int) {
        holder.onBind(friends[position])
    }
}
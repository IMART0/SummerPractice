package com.example.auto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import com.example.auto.databinding.FragmentAnswerBinding
import com.example.auto.databinding.FragmentInfoBinding
import com.example.auto.databinding.FragmentMainBinding

class InformationFragment : Fragment(R.layout.fragment_info) {
    private var binding: FragmentInfoBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInfoBinding.bind(view)
        val friend = FriendsRepository.friends.find {
            it.id == (arguments?.getInt(ARG_ID) ?: -1)
        }

        binding?.run {
            back.setOnClickListener{
                findNavController().navigate(
                    resId = R.id.action_informationFragment_to_friendsFragment2
                )
            }
            if (friend != null){
                tvName.text = friend.name
                tvLongDescription.text = friend.longDescription
                tvShortDescription.text = friend.shortDescription
                Glide.with(imageView.context)
                    .load(friend.imgUrl)
                    .error(R.drawable.hero)
                    .placeholder(R.drawable.baseline_sync_24)
                    .into(imageView)
            } else tvInfo.text = "ERROR"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    companion object {
        private const val ARG_ID = "ARG_ID"
        fun bundle(id: Int): Bundle = Bundle().apply {
            putInt(ARG_ID, id)
        }
    }
}
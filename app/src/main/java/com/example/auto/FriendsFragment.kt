package com.example.auto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.auto.databinding.FragmentFriendsBinding
import com.example.auto.databinding.FragmentMainBinding
import com.example.auto.databinding.FragmentProfileBinding

class FriendsFragment : Fragment(R.layout.fragment_friends) {
    private var binding: FragmentFriendsBinding? = null
    private var adapter: FriendsAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFriendsBinding.bind(view)
        initAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun initAdapter() {
        adapter = FriendsAdapter(
            friends = FriendsRepository.friends,
            glide = Glide.with(this),
            onClick = {
                findNavController().navigate(
                    resId = R.id.action_friendsFragment2_to_informationFragment,
                    args = InformationFragment.bundle(id = it.id)
                )
            }
        )
        binding?.run {
            rvFriends.adapter = adapter
            rvFriends.layoutManager = LinearLayoutManager(requireContext())
        }
    }

}
package com.example.auto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.auto.databinding.FragmentFriendsBinding
import com.example.auto.databinding.FragmentMainBinding
import com.example.auto.databinding.FragmentProfileBinding

class FriendsFragment : Fragment(R.layout.fragment_friends) {
    private var binding: FragmentFriendsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFriendsBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}
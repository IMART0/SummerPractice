package com.example.auto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.ui.setupWithNavController
import com.example.auto.databinding.FragmentAnswerBinding
import com.example.auto.databinding.FragmentMainBinding

class AnswerFragment : Fragment(R.layout.fragment_answer) {
    private var binding: FragmentAnswerBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAnswerBinding.bind(view)
        val message = arguments?.getString(ARG_MESSAGE) ?: "ERROR"

        binding?.run {
            answer.text = "${answer.text}: $message"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    companion object {
        private const val ARG_MESSAGE = "ARG"
        fun bundle(message: String): Bundle = Bundle().apply {
            putString(ARG_MESSAGE, message)
        }
    }
}
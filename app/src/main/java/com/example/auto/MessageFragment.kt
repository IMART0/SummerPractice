package com.example.auto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.auto.databinding.FragmentMessageBinding
import com.google.android.material.snackbar.Snackbar

class MessageFragment : Fragment(R.layout.fragment_message) {
    private var binding: FragmentMessageBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMessageBinding.bind(view)

        binding?.run {
            button.setOnClickListener {
                if (editText.text.toString() != "") {
                    findNavController().navigate(
                        resId = R.id.action_messageFragment2_to_answerFragment,
                        args = AnswerFragment.bundle(message = editText.text.toString())
                    )
                }
                else Snackbar.make(root, "Для отправки текста требуется заполнить поле", Snackbar.LENGTH_SHORT).show()

            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}
package com.example.navigation_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_example.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
    lateinit var binding: FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        binding = FragmentBlankBinding.bind(view)

        val contact = arguments?.getSerializable("contact") as Contact

        binding.tv.text = "${contact.name} ${contact.number}"

        binding.back.setOnClickListener {
            findNavController().popBackStack()
        }

        return view
    }
}
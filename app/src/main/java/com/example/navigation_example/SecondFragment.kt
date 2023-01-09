package com.example.navigation_example

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_example.databinding.FragmentSecond2Binding

class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecond2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second2, container, false)
        binding = FragmentSecond2Binding.bind(view)

        binding.next.setOnClickListener {
            val name = binding.etName.text.toString()
            val number = binding.etNumber.text.toString()

            val contact = Contact(name, number)

            val bundle = Bundle()
            bundle.putSerializable("contact", contact)

            findNavController().navigate(R.id.blankFragment, bundle)
        }

        return view
    }
}
package com.example.homework6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework6.databinding.FragmentEnjoyBinding


class EnjoyFragment : Fragment() {
    lateinit var binding: FragmentEnjoyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEnjoyBinding.inflate(layoutInflater)
        return binding.root
    }

}
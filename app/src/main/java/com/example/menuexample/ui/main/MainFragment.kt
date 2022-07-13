package com.example.menuexample.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.menuexample.databinding.MainFragmentLayoutBinding

class MainFragment: Fragment() {

    private var _binding: MainFragmentLayoutBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = MainFragmentLayoutBinding.inflate(inflater, container, false)

        return binding.root
    }

}
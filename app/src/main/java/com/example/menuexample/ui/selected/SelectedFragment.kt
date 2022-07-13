package com.example.menuexample.ui.selected

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.menuexample.databinding.SelectedFragmentLayoutBinding

class SelectedFragment: Fragment() {

    private var _binding: SelectedFragmentLayoutBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = SelectedFragmentLayoutBinding.inflate(inflater, container, false)

        return binding.root
    }

}
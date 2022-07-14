package com.example.menuexample.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.menuexample.databinding.MenuFragmentLayoutBinding

class MenuFragment : Fragment() {

    private var _binding: MenuFragmentLayoutBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = MenuFragmentLayoutBinding.inflate(inflater, container, false)

        return binding.root
    }

    companion object {
        const val MENU_KEY = "MENU_KEY"
    }

}
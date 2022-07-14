package com.example.menuexample.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.menuexample.databinding.MenuFragmentLayoutBinding


class MenuFragment : Fragment() {

    private var _binding: MenuFragmentLayoutBinding? = null
    private var viewModel: MenuViewModel? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = MenuFragmentLayoutBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[MenuViewModel::class.java]
        viewModel?.setArguments(requireArguments().getInt(MENU_KEY))
        viewModel?.menuDataMLD?.observe(viewLifecycleOwner, {
            binding.recyclerView.adapter = MenuAdapter(it)
        })
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    companion object {
        const val MENU_KEY = "MENU_KEY"
    }

}
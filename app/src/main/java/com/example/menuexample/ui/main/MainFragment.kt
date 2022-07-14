package com.example.menuexample.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.menuexample.databinding.MainFragmentLayoutBinding


class MainFragment : Fragment() {

    private var _binding: MainFragmentLayoutBinding? = null
    private var viewModel: MainViewModel? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = MainFragmentLayoutBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel?.text?.observe(viewLifecycleOwner, {
            binding.recyclerView.adapter = MainAdapter(
                it,
                object: MainAdapter.OnMainItemClick {
                    override fun onMainItemClick(position: Int) {
                        Toast.makeText(context, position.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            )
        })
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}
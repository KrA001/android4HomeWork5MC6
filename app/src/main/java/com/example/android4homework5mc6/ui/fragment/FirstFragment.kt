package com.example.android4homework5mc6.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android4homework5mc6.R
import com.example.android4homework5mc6.databinding.FragmentFirstBinding
import com.example.android4homework5mc6.ui.adapter.RickAndMortyAdapter

class FirstFragment : Fragment(R.layout.fragment_first) {

    private val viewModel: FirstViewModel by viewModels()
    private var rickAndMortyAdapter = RickAndMortyAdapter()
    private val binding by viewBinding(FragmentFirstBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        observeLiveData()
    }

    private fun setupRecyclerView() {
        binding.rvRickAndMorty.adapter = rickAndMortyAdapter
    }

    private fun observeLiveData() = with(viewModel) {
        locationCharacterState.observe(viewLifecycleOwner) { data ->
            rickAndMortyAdapter.submitList(data)
        }
    }
}
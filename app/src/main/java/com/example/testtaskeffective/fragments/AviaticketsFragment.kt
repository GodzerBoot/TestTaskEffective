package com.example.testtaskeffective.fragments


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.testtaskeffective.MainActivity
import com.example.testtaskeffective.R
import com.example.testtaskeffective.databinding.FragmentAviaticketsBinding


class AviaticketsFragment : Fragment(){
    lateinit var binding: FragmentAviaticketsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAviaticketsBinding.inflate(layoutInflater)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val searchButton = binding.aviaticketsSearchButton
        searchButton.setOnClickListener {
            SearchDialogFragment().show(childFragmentManager, SearchDialogFragment.TAG)
        }

    }

}
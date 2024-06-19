package com.example.testtaskeffective.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.SearchView
import com.example.testtaskeffective.databinding.FragmentSearchBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

open class SearchDialogFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(layoutInflater)

        return binding.root
    }

    companion object {
        const val TAG = "PurchaseConfirmationDialog"
    }
}

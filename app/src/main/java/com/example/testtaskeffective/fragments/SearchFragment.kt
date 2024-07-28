package com.example.testtaskeffective.fragments


import android.graphics.BitmapFactory
import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testtaskeffective.databinding.FragmentSearchBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.squareup.picasso.Picasso
import java.io.File
import java.net.URL

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val popularImg1 = binding.popularImg1



        Picasso.get().isLoggingEnabled=true
        Picasso.get()
            .load(File("D:\\Downloads\\phuket.png"))
            .into(popularImg1)


    }

    companion object {
        const val TAG = "mFragment"
    }
}

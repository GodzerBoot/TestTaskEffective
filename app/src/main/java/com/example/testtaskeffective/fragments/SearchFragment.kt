package com.example.testtaskeffective.fragments



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.testtaskeffective.R
import com.example.testtaskeffective.databinding.FragmentSearchBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

import com.squareup.picasso.Picasso


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

        Picasso.get()
            .isLoggingEnabled = true
        Picasso.get()
            .load("https://upload.wikimedia.org/wikipedia/commons/d/d0/Rose_flower_at_the_Lalbaghgarden_Bangalore.jpg")
            .placeholder(R.drawable.aviaticket_default)
            .resize(40, 40)
            .centerCrop()
            .into(popularImg1)

        val popular1 = binding.popular1

        popular1.setOnClickListener{
            activity?.supportFragmentManager?.commit {
                replace<PricesFragment>(R.id.fragmentContainerView)
                setReorderingAllowed(true)
                addToBackStack("PricesFragment")
            }
        }
    }

    companion object {
        const val TAG = "SearchFragment"
    }
}

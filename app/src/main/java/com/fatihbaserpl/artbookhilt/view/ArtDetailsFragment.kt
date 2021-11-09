package com.fatihbaserpl.artbookhilt.view

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fatihbaserpl.artbookhilt.R
import com.fatihbaserpl.artbookhilt.databinding.FragmentArtDetailBinding
import com.fatihbaserpl.artbookhilt.databinding.FragmentArtsBinding

class ArtDetailsFragment: Fragment(R.layout.fragment_art_detail) {


    private var fragmentBinding : FragmentArtDetailBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentArtDetailBinding.bind(view)
        fragmentBinding = binding

        binding.artImageView.setOnClickListener {
            findNavController().navigate(ArtDetailsFragmentDirections.actionArtDetailsFragmentToImageApiFragment())
        }

        val callback = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                findNavController().popBackStack()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(callback)

    }

    override fun onDestroyView() {

        fragmentBinding=null
        super.onDestroyView()
    }
}
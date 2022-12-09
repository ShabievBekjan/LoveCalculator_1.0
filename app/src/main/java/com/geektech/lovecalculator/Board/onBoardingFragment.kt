package com.geektech.lovecalculator.Board

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lovecalculator.R
import com.example.lovecalculator.databinding.FragmentBoardingBinding

class onBoardingFragment : Fragment() {

        private lateinit var binding: FragmentBoardingBinding
        private var titles = ArrayList<onBoard>()

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?,
        ): View? {
            binding = FragmentBoardingBinding.inflate(inflater)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            loadBoard()
            val adapter = onBoardingAdapter(titles, this::onClick)
            binding.viewpager.adapter = adapter
            binding.wormDotsIndicator.attachTo(binding.viewpager)
        }

        private fun loadBoard(){
            titles.add(onBoard("Have a good time","You should the time to help those \nwho need you",
                R.drawable.img_1))
            titles.add(onBoard("Cherishing Love","It is now no longer possible for \nyou to cherish love",
                R.drawable.img_2))
            titles.add(onBoard("Have a breakup?","We have made the correction for you \ndon't worry \nMaybe someone is waiting for you",
                R.drawable.img_3))
        }

        private fun onClick(){
            findNavController().navigate(R.id.loveFragment)
        }


    }

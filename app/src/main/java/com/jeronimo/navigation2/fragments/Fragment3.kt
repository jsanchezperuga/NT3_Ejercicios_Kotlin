package com.jeronimo.navigation2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.jeronimo.navigation2.R


class Fragment3 : Fragment() {

    lateinit var vista: View
    lateinit var btn1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_3, container, false)

        btn1 = vista.findViewById(R.id.btn_frag_1_f3)
        return vista
    }

    override fun onStart() {
        super.onStart()
        btn1.setOnClickListener{
        val action = Fragment3Directions.actionFragment3ToFragment1()
            vista.findNavController().navigate(action)
        }
    }
}
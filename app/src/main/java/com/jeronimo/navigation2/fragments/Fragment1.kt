package com.jeronimo.navigation2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.findNavController
import com.jeronimo.navigation2.R




class Fragment1 : Fragment() {

    lateinit var vista: View
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var et_Text : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_1, container, false)

        btn1 = vista.findViewById(R.id.btn_frag_2)
        btn2 = vista.findViewById(R.id.btn_frag_3)
        return vista
    }

    override fun onStart() {
        super.onStart()
        btn1.setOnClickListener{
            et_Text = vista.findViewById(R.id.et_input)
            val valueTxt: String = et_Text.text.toString()
            val value: Int = 420
            val action = Fragment1Directions.actionFragment1ToFragment2(valueTxt)
            vista.findNavController().navigate(action)
        }
        btn2.setOnClickListener{
            val action = Fragment1Directions.actionFragment1ToFragment3()
            vista.findNavController().navigate(action)
        }
    }




}
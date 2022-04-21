package com.jeronimo.navigation2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.jeronimo.navigation2.R


class Fragment2 : Fragment() {
    // TODO: Rename and change types of parameters
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
        vista = inflater.inflate(R.layout.fragment_2, container, false)

        btn1 = vista.findViewById(R.id.btn_frag_1_f2)

        return vista
    }
    val args: Fragment2Args by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tv: TextView = view.findViewById(R.id.txt_value_frg2)
        val amount = args.textPassed
        tv.text = amount.toString()
    }

    override fun onStart() {
        super.onStart()
        btn1.setOnClickListener{
            val action = Fragment2Directions.actionFragment2ToFragment1()
            vista.findNavController().navigate(action)
        }
    }


}
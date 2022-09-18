package com.example.practicandonav.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import com.example.practicandonav.R
import org.w3c.dom.Text


class SegundoFragmento : Fragment() {

    lateinit var vistaFragment1: View
    lateinit var btnFragmentReturnMain2: Button
    lateinit var titleWindow : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        vistaFragment1 = inflater.inflate(R.layout.fragment_segundo_fragmento, container, false)
        btnFragmentReturnMain2 = vistaFragment1.findViewById(R.id.btnFragmentReturnMain2)
        titleWindow = vistaFragment1.findViewById(R.id.txtFragmenteTitle2)

        return vistaFragment1
    }

    override fun onStart() {
        super.onStart()

        var param1 = SegundoFragmentoArgs.fromBundle(requireArguments()).param1

        titleWindow.text = param1

        btnFragmentReturnMain2.setOnClickListener {

            var action1 = SegundoFragmentoDirections.actionSegundoFragmentoToPrimerFragmento()

            vistaFragment1.findNavController().navigate(action1)

        }

    }


}
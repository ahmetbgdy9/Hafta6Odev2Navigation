package com.ahmetbugday.Hafta6Odev2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ahmetbugday.Hafta6Odev2.databinding.FragmentIkiBinding


class FragmentIki : Fragment() {
    private lateinit var tasarim: FragmentIkiBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,
    ): View? {
        tasarim = FragmentIkiBinding.inflate(inflater,container,false)
        tasarim.button3FragmentGecis.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.UcuncuSayfayaGecis)

        }
        return tasarim.root
    }

}
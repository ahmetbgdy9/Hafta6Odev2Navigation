package com.ahmetbugday.Hafta6Odev2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ahmetbugday.Hafta6Odev2.databinding.FragmentBirBinding



class FragmentBir : Fragment() {
    private lateinit var tasarim: FragmentBirBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,
    ): View? {
        tasarim = FragmentBirBinding.inflate(inflater,container,false)
        tasarim.button2FragmentGecis.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.ikinciSayfayaGecis)

        }
        return tasarim.root
    }

}
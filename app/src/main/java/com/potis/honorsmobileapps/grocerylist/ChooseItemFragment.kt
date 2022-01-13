package com.potis.honorsmobileapps.grocerylist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.potis.honorsmobileapps.grocerylist.databinding.FragmentChooseItemBinding
import com.potis.honorsmobileapps.grocerylist.databinding.FragmentHomeBinding

class ChooseItemFragment : Fragment() {
    private var _binding: FragmentChooseItemBinding? = null
    private val binding get()=_binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentChooseItemBinding.inflate(inflater, container, false)
        val rootView=binding.root
        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding =null
    }
}
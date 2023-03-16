package com.example.cupcakeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.cupcakeapp.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private var binding: FragmentStartBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentStartBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            btnOrderOneCupcake.setOnClickListener { orderCupcake(1) }
            btnOrderSixCupcakes.setOnClickListener { orderCupcake(6) }
            btnOrderTwelveCupcakes.setOnClickListener { orderCupcake(12) }
        }
    }

    fun orderCupcake(quantity: Int) {
        Toast.makeText(activity, "Ordered $quantity cupcake(s)", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
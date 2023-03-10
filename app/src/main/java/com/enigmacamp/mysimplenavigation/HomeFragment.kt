package com.enigmacamp.mysimplenavigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var userProfile: UserProfile? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        userProfile = HomeFragmentArgs.fromBundle(requireArguments()).userProfile
        Log.d("Home-Fragment", userProfile?.fullName.toString())
        val btnProfile = view.findViewById<Button>(R.id.btn_profile)
        val btnAboutUs = view.findViewById<Button>(R.id.btn_about_us)
        val btnPayment = view.findViewById<Button>(R.id.btn_payment)
        btnProfile.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_profileFragment)
        }
        btnAboutUs.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_aboutUsFragment)
        }
        btnPayment.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_paymentFragment)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}
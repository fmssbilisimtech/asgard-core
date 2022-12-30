package com.asgard.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.asgard.common.connection.InternetConnectionChecker
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

open class BaseBottomSheet<T : ViewDataBinding>(@LayoutRes private val layoutResId: Int) : BottomSheetDialogFragment() {

    private var _binding: T? = null
    val binding: T get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, layoutResId, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            if (!InternetConnectionChecker.isInternetConnected(requireContext())) {
                InternetConnectionChecker.showNoInternetDialog(requireContext())
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
package com.asgard.common.connection

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.google.android.material.dialog.MaterialAlertDialogBuilder


object InternetConnectionChecker {

    fun isInternetConnected(context: Context): Boolean {

        // Get connectivity manager
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // API 23+
            val network: Network? = connectivityManager.activeNetwork
            val capabilities = connectivityManager.getNetworkCapabilities(network)
            (capabilities != null) && (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)
                    || capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR))
        } else {
            // API 21-22
            val networkInfo = connectivityManager.activeNetworkInfo
            networkInfo != null && networkInfo.isConnected
        }
    }

    fun showNoInternetDialog(requireContext: Context) {
        //Show dialog.
        MaterialAlertDialogBuilder(requireContext)
            .setTitle("Bağlantı Başarısız")
            .setMessage("İnternet bağlantınızda bir sorun oluştu. Lütfen bağlantınızı kontrol edin.")
            .setPositiveButton("Tamam") { dialog, _ ->
                dialog.dismiss()
            }
            .create()

    }
}
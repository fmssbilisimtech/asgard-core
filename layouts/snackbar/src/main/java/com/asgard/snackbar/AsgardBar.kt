package com.asgard.snackbar

import android.graphics.Color
import android.view.View
import androidx.core.graphics.toColorInt
import com.google.android.material.snackbar.Snackbar

class AsgardBar(
    private val view: View,
    private val message: String,
    private val type: AsgardBarType = AsgardBarType.DEFAULT,
    private val duration: Int = Snackbar.LENGTH_LONG,
    private val actionText: String? = null,
    private val action: (() -> Unit)? = null
) {

    fun show() {
        val snackbar = Snackbar.make(view, message, duration)

        snackbar.view.setBackgroundColor(type.colorCode.toColorInt())
        snackbar.view.setBackgroundResource(R.drawable.custom_snackbar)
        snackbar.setTextColor(Color.WHITE)
        //Change snackbar border radius
        if (actionText != null && action != null) {
            snackbar.setAction(actionText) { action.invoke() }
        }
        snackbar.show()
    }

}
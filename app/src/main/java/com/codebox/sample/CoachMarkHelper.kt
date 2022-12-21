package com.codebox.sample

import android.app.Activity
import android.graphics.Color
import android.graphics.Rect
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.codebox.coachmark.constants.Gravity
import com.codebox.coachmark.constants.Orientation
import com.codebox.coachmark.views.CoachMarkInfo
import com.codebox.coachmark.views.CoachMarkInfoToolTip
import com.codebox.coachmark.views.CoachMarkOverlay

class CoachMarkHelper {

    /**
     * Note - Avoid re-instantiation and use Coach mark object that is already
     */


    fun showCoachMarks(activity: Activity, infoText: String, view: View) {
        buildCoachMarks(activity, infoText, view, null).build().show(activity.window.decorView as ViewGroup)
    }

    fun showCoachMarks(activity: Activity, infoText: String, rect: Rect) {
        buildCoachMarks(activity, infoText, null, rect).build().show(activity.window.decorView as ViewGroup)
    }

    fun showCoachMarks(activity: Activity, infoText: String, left: Int, top: Int, right: Int, bottom: Int) {
        buildCoachMarks(activity, infoText, null, Rect(left, top, right, bottom)).build().show(activity.window.decorView as ViewGroup)
    }
    /**
     * This method is used to build default coach marks
     */
    private fun buildCoachMarks(activity: Activity, infoText: String, view: View?, rect: Rect?): CoachMarkOverlay.Builder {
        val coachMarkOverlay = CoachMarkOverlay.Builder(activity)
                .setOverlayClickListener(object : CoachMarkOverlay.OverlayClickListener {
                    override fun onOverlayClick(overlay: CoachMarkOverlay) {
                        overlay.remove()
                    }
                })
                .setInfoViewBuilder(
                        CoachMarkInfo.Builder(activity)
                                .setInfoText(infoText)
                                .setInfoViewGravity(Gravity.BOTTOM)
                ).setToolTipBuilder(
                CoachMarkInfoToolTip.Builder(activity).setToolTipColor(Color.GRAY).setToolTipOrientation(
                Orientation.UP))
        if (view != null)
            coachMarkOverlay.setOverlayTargetView(view)
        else if (rect != null)
            coachMarkOverlay.setOverlayTargetCoordinates(rect)

        return coachMarkOverlay
    }




}

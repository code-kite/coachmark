package com.codebox.coachmark.listener

import com.codebox.coachmark.views.CoachMarkOverlay
import com.codebox.coachmark.configuration.CoachMarkSequenceHandler

interface SequenceListener{
    fun onNextItem(coachMark : CoachMarkOverlay, coachMarkSequenceHandler : CoachMarkSequenceHandler){
        coachMarkSequenceHandler.setNextView()
    }
}
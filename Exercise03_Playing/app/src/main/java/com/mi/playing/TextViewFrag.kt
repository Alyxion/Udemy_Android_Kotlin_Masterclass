package com.mi.playing

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by mikemann on 03.04.18.
 */
class TextViewFrag : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater?.inflate(R.layout.note_layout, container, false)
    }
}
package com.wavepopuplib.effects;

import android.view.ViewGroup;
import android.widget.ImageView;

public interface Effect {

    float getValue();

    void effect(ViewGroup vp, ImageView view);

}

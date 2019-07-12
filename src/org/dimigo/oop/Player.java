package org.dimigo.oop;

import javax.print.attribute.standard.Media;

public class Player {
    public void play(){
        MediaPlayer mp = MediaPlayer.getInstance();
        mp.setVolume(10);
    }

}

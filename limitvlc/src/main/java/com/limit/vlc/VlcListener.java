package com.limit.vlc;

import org.videolan.libvlc.MediaPlayer;
/**
 * Created by limit on 25/06/17.
 */
public interface VlcListener {

  void onComplete();

  void onError();

  void onBuffering(MediaPlayer.Event event);//event.getBuffering(),Hide if 100, else Show
}

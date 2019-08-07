package cn.compaind.mvc.model;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequence;
import java.util.ArrayList;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequence sequence;
    ArrayList beatObserver = new ArrayList();
    ArrayList bmpObserver  = new ArrayList();
    int bmp = 90;

    @Override
    public void init() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void steBPM(int bpm) {

    }

    @Override
    public int getBPM() {
        return 0;
    }

    @Override
    public void registerObserver() {

    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void meta(MetaMessage meta) {

    }
}

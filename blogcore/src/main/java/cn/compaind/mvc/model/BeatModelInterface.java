package cn.compaind.mvc.model;

/**
 * model 存储数据，控制逻辑
 */
public interface BeatModelInterface {
    void init();
    void on();
    void off();
    void steBPM(int bpm);

    int getBPM();
    void registerObserver();
    void removeObserver();
    //void registerObserver();
    //void removeObserver();
}

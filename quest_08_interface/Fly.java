package quest_08_interface;

public interface Fly {

    // décoller
    void takeOff();

    // monter
    int ascend(int meters);

    // glisser
    void glide();

    // descendre
    int descend(int meters);

    // atterrir
    void land();
}

package so.glad.channel.steam.model;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public enum PersonState {
    OFFLINE(0), ONLINE(1), BUSY(2), AWAY(3), SNOOZE(4), LOOKINGTOTRADE(5), LOOKINGTOPLAY(6);

    private int code;

    private PersonState(int code){
        this.code = code;
    }

    public int code(){
        return code;
    }
}

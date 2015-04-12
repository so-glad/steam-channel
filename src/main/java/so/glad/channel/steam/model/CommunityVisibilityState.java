package so.glad.channel.steam.model;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public enum CommunityVisibilityState {
    PRIVATE(1), PUBLIC(3);

    private int code;

    private CommunityVisibilityState(int code){
        this.code = code;
    }
    public int code(){
        return code;
    }
}

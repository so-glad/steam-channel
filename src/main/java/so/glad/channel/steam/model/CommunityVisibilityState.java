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

    public static CommunityVisibilityState recognise(int code) {
        for(CommunityVisibilityState communityVisibilityState: CommunityVisibilityState.values()){
            if (code == communityVisibilityState.code()){
                return communityVisibilityState;
            }
        }
        return null;
    }
}

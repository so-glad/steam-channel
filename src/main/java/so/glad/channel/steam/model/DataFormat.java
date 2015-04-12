package so.glad.channel.steam.model;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public enum DataFormat {

    DEFAULT("json"), JSON("json"), XML("xml"), VDF("vdf");

    private String value;

    private DataFormat(String value){
        this.value = value;
    }

    public String value(){
        return this.value;
    }
}

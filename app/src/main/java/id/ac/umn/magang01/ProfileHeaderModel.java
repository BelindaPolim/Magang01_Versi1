package id.ac.umn.magang01;

import com.google.gson.annotations.SerializedName;

public class ProfileHeaderModel {
    @SerializedName("id")
    private String code;
    @SerializedName("name")
    private String name;

    public ProfileHeaderModel(String id, String name){
        this.code = id;
        this.name = name;
    }

    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
}

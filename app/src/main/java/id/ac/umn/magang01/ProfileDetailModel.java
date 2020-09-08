package id.ac.umn.magang01;

import com.google.gson.annotations.SerializedName;

public class ProfileDetailModel {
    @SerializedName("sequence")
    private int seq;
    @SerializedName("info")
    private String info;

    public ProfileDetailModel(Integer seq, String info){
        this.seq = seq;
        this.info = info;
    }

    public int getSeq() {
        return seq;
    }

    public String getInfo() {
        return info;
    }
}

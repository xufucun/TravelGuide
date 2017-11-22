package cn.xufucun.udacity.travelguide;

/**
 * Created by xufuc on 2017/11/22.
 */

public class Information {

    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResId = NO_IMAGE_PROVIDED; //默认无图片

    private String name;         //名称
    private String introduction; //简介


    public Information(int imgId , String name ,String introduction){
        imageResId = imgId;
        this.name = name;
        this.introduction = introduction;
    }

    public Information(String name ,String introduction){
        this.name = name;
        this.introduction = introduction;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public boolean hasImage() {
        return imageResId != NO_IMAGE_PROVIDED;
    }
}

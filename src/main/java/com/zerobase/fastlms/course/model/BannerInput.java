package com.zerobase.fastlms.course.model;

import lombok.Data;

@Data
public class BannerInput {

    Long id;
    String bannerName;
    String linkAddress;
    String openMethod;

    //ADD
    String filename;
    String urlFilename;

    int order;

    boolean open;
}

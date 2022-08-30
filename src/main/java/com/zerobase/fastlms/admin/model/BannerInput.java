package com.zerobase.fastlms.admin.model;

import lombok.Data;

@Data
public class BannerInput {

    Long id;
    String bannerName;
    String linkAddress;
    String openMethod;

    String alterText;

    //ADD
    String filename;
    String urlFilename;

    String idList;

    int order;

    boolean open;
}

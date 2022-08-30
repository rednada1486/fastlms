package com.zerobase.fastlms.admin.service;

import com.zerobase.fastlms.admin.dto.BannerDto;
import com.zerobase.fastlms.admin.model.BannerInput;
import com.zerobase.fastlms.admin.model.BannerParam;

import java.util.List;

public interface BannerService {
    
    
    /**
     * 배너등록
     */
    boolean add(BannerInput parameter);

    boolean set(BannerInput parameter);


    BannerDto getById(long id);


    List<BannerDto> list(BannerParam parameter);

    boolean del(String idList);

    List<BannerDto> frontList();
}

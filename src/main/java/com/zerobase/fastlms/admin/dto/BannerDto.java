package com.zerobase.fastlms.admin.dto;

import com.zerobase.fastlms.admin.entity.Banner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BannerDto {
    
    long id;

    String bannerName;
    String linkAddress;
    String openMethod;
    String alterText;

    //ADD
    String filename;
    String urlFilename;

    int orderValue;
    boolean open;

    //추가컬럼
    long totalCount;
    long seq;

    LocalDateTime regDt;
    
    public static BannerDto of(Banner banner) {
        return BannerDto.builder()
                .id(banner.getId())
                .bannerName(banner.getBannerName())
                .filename(banner.getFilename())
                .urlFilename(banner.getUrlFilename())
                .linkAddress(banner.getLinkAddress())
                .openMethod(banner.getOpenMethod())
                .orderValue(banner.getOrderValue())
                .open(banner.isOpen())
                .regDt(banner.getRegDt())
                .alterText(banner.getAlterText())
                .build();
    }
    
    public static List<BannerDto> of(List<Banner> banners) {
        
        if (banners == null) {
            return null;
        }
    
        List<BannerDto> bannerList = new ArrayList<>();
        for(Banner x : banners) {
            bannerList.add(BannerDto.of(x));
        }
        return bannerList;
        
        /*
        if (courses != null) {
            List<CourseDto> courseList = new ArrayList<>();
            for(Course x : courses) {
                courseList.add(CourseDto.of(x));
            }
            return courseList;
        }
        return null;
        */
        
    }

    public String getRegDtText() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        return regDt != null ? regDt.format(formatter) : "";
    }

}


















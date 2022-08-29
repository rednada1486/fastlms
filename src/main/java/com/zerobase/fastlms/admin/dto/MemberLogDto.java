package com.zerobase.fastlms.admin.dto;

import com.zerobase.fastlms.admin.entity.Category;
import com.zerobase.fastlms.member.entity.Member;
import com.zerobase.fastlms.member.entity.MemberLog;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MemberLogDto {

    private Long id;
    private String userId;

    private LocalDateTime loginDt;
    private String clientIp;
    private String userAgent;
    
    //추가컬럼
    long totalCount;
    long seq;

    public static MemberLogDto of(MemberLog memberlog) {
        
        return MemberLogDto.builder()
                .userId(memberlog.getUserId())
                .loginDt(memberlog.getLoginDt())
                .clientIp(memberlog.getClientIp())
                .userAgent(memberlog.getUserAgent())
                .build();
    }

    public static List<MemberLogDto> of (List<MemberLog> logList) {
        if (logList != null) {
            List<MemberLogDto> result = new ArrayList<>();
            for(MemberLog x : logList) {
                result.add(of(x));
            }
            return result;
        }

        return null;
    }

    

    public String getLoginDtText() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
        return loginDt != null ? loginDt.format(formatter) : "";
    }
    
}

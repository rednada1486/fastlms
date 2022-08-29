package com.zerobase.fastlms.member.repository;

import com.zerobase.fastlms.member.entity.Member;
import com.zerobase.fastlms.member.entity.MemberLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberLogRepository extends JpaRepository<MemberLog, Long> {
    List<MemberLog> findByUserIdOrderByLoginDt(String userId);

}

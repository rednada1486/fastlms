package com.zerobase.fastlms.course.repository;

import com.zerobase.fastlms.course.entity.Banner;
import com.zerobase.fastlms.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BannerRepository extends JpaRepository<Banner, Long> {

}

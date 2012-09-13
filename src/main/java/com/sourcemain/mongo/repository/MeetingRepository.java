package com.sourcemain.mongo.repository;

import com.sourcemain.mongo.domain.Meeting;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created with IntelliJ IDEA.
 * User: ballmw
 * Date: 9/9/12
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public interface MeetingRepository extends PagingAndSortingRepository<Meeting, Long> {
}
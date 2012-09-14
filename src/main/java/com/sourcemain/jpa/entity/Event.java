package com.sourcemain.jpa.entity;

import com.sourcemain.mongo.domain.Meeting;
import org.springframework.data.annotation.Id;

import javax.annotation.Generated;

/**
 * Created with IntelliJ IDEA.
 * User: ballmw
 * Date: 9/9/12
 * Time: 1:14 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @RelatedDocument
    private Meeting meeting;
}

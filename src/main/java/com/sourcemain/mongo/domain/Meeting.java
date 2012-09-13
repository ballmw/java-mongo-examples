package com.sourcemain.mongo.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ballmw
 * Date: 9/9/12
 * Time: 1:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Meeting {

    @Id
    private String id;
    private String topic;
    private Speaker speaker;
    private Sponsor sponsor;
    private String description;
    private String biography;
    private int attendees;
    private List<Comment> comments;
}

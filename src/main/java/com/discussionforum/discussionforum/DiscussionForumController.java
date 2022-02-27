package com.discussionforum.discussionforum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscussionForumController {

    @RequestMapping("/")
    public String getDiscussion() {
        return "index";
    }

}

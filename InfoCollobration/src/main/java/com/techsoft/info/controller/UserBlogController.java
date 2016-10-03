package com.techsoft.info.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.techsoft.info.model.UserBlog;
import com.techsoft.info.service.UserBlogSRV;


@RestController
public class UserBlogController {

	@Autowired
	UserBlogSRV ubsrv;
	
    @RequestMapping(value = "/blog/", method = RequestMethod.GET)
    public ResponseEntity<List<UserBlog>> listAll() {
        List<UserBlog> blgs = ubsrv.getAllBlogs();
        if(blgs.isEmpty()){
            return new ResponseEntity<List<UserBlog>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<UserBlog>>(blgs, HttpStatus.OK);
    }

    @RequestMapping(value = "/blog/", method = RequestMethod.POST)
    public ResponseEntity<Void> createBlog(@RequestBody UserBlog blog, UriComponentsBuilder ucBuilder) 
    {
    	System.out.println("save");
    	blog.setID("2");
    	blog.setBlogApproved('N');
    	blog.setBlogDate(new Date().toString());
    	blog.setPublicFlag("Y");
    	
    	ubsrv.saveBlog(blog);
 
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}

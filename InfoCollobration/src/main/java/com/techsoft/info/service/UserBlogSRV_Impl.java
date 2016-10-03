package com.techsoft.info.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techsoft.info.dao.UserBlogDAO;
import com.techsoft.info.model.UserBlog;

@Service
@Transactional
public class UserBlogSRV_Impl implements UserBlogSRV {

	@Autowired
	UserBlogDAO ubDAO;
	
	@Override
	public List<UserBlog> getAllBlogs() {
		return ubDAO.getAllBlogs();
	}

	@Override
	public void saveBlog(UserBlog ub) {
		ubDAO.saveBlog(ub);
	}

}

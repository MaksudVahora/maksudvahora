package com.techsoft.info.dao;

import java.util.List;

import com.techsoft.info.model.UserBlog;

public interface UserBlogDAO {

	List<UserBlog> getAllBlogs();
	void saveBlog(UserBlog ub);
	
}

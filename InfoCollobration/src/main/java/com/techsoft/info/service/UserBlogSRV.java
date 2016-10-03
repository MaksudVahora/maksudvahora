package com.techsoft.info.service;

import java.util.List;
import com.techsoft.info.model.UserBlog;

public interface UserBlogSRV {

	List<UserBlog> getAllBlogs();
	void saveBlog(UserBlog ub);
	
}

package com.techsoft.info.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techsoft.info.model.UserBlog;

@Repository
public class UserBlogDAO_Impl implements UserBlogDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserBlog> getAllBlogs() {
		return sessionFactory.getCurrentSession().createQuery("From UserBlog").list();
	}

	@Override
	public void saveBlog(UserBlog ub) {
		sessionFactory.getCurrentSession().save(ub);
	}
}

'use strict';

angular.module('myApp').controller('blogController', ['$scope', 'blogservice', function($scope, blogservice) 
{
    	var self = this;
    	self.blog = {ID:null, blogmessage:'', blogtitle:''}
    	self.blogs=[];
    	self.submit = submit;
    	self.error = '';
    	
    	fetchAllBlogs();

    	function fetchAllBlogs(){
    		blogservice.fetchAllBlogs().then(function(data)
    		{
    			self.blogs = data;
    		},
    		function(errResponse)
    		{
    			self.error = errResponse.statusText;
    		}
       );
    }
    function createBlog(blog)
    {
    	alert("in angular controller");
    	blogservice.createBlog(blog)
    		.then(fetchAllBlogs,function(errResponse) {
    			alert("after in angular controller");
    			self.error = errResponse.statusText;
    		}
    	);
    }
    function submit() {
    	createBlog(self.blog);
    }
}]);

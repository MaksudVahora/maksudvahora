'use strict';

angular.module('myApp').factory('blogservice', ['$http', '$q', function($http, $q){

    var REST_SERVICE_URI = 'http://localhost:8080/InfoCollobration/blog/';

    var factory = {
    	fetchAllBlogs: fetchAllBlogs,
    	createBlog: createBlog
    };

    return factory;

	//$http.defaults.headers.post["Content-Type"] = "application/json";

    function fetchAllBlogs() 
    {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI).then(function (response) 
        {
             deferred.resolve(response.data);
        }, function(errResponse)
        {
            deferred.reject(errResponse);
        }
      );
      return deferred.promise;
    }

    function createBlog(blog) {
        var deferred = $q.defer();
        alert("In service" + REST_SERVICE_URI + " " + blog.blogtitle + " " + blog.blogmessage);
 
        $http.post('http://localhost:8080/InfoCollobration/blog/', blog).then(function (response) {
        		alert("hi");
        		deferred.resolve(response.data);
        	},
        	function(errResponse)
        	{
        		alert("Error : " + errResponse.statusText);
                deferred.reject(errResponse);
        	}
      );
      return deferred.promise;
    }
}]);

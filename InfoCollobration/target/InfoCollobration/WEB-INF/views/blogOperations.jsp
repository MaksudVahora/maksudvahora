<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css'/>">
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.min.js"></script>
	<script src="<c:url value='/resources/js/angular-route.min.js' />"></script>
	<script src="<c:url value='/resources/js/app.js' />"></script>
	<script src="<c:url value='/resources/js/controller/blog_controller.js' />"></script>
	<script src="<c:url value='/resources/js/service/blog_service.js' />"></script>
</head>
<body ng-app="myApp">
	<div class="generic-container" ng-controller="blogController as ctrl">
	
	<div class="panel panel-default">
              <div class="panel-heading"><span class="lead">Blog Form </span></div>
              <div class="formcontainer">
                  <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
                      <input type="hidden" ng-model="ctrl.blog.id" />
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="blogtitle">Subject</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.blog.blogtitle" id="blogtitle" 
                                  	class="blogtitle form-control input-sm" placeholder="Subject" required />
                                  	<div class="has-error" ng-show="myForm.$dirty">
                                      	<span ng-show="myForm.blogtitle.$error.required">This is a required field</span>
                                  	</div>
							  	</div>
						   </div>
					  </div>
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="blogmessage">Message</label>
                              <div class="col-md-7">
                                  <textarea rows="5" cols="60" ng-model="ctrl.blog.blogmessage" id="blogmessage" 
                                  	class="blogmessage form-control input-sm" 
                                  	placeholder="Description" required></textarea>
                                  	<div class="has-error" ng-show="myForm.$dirty">
                                      	<span ng-show="myForm.blogmessage.$error.required">This is a required field</span>
                                  	</div>
							  	</div>
						   </div>
					  </div>
					  
					  <div class="row">
                          <div class="form-actions floatRight">
                              <input type="submit"  class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid">
                              <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" 
                              	ng-disabled="myForm.$pristine">Reset Form</button>
                          </div>
                      </div>
                      
				</form>
			</div>
		</div>                                  
		<div class="panel panel-default">
			<div class="panel-heading">
				<span class="lead">List of Blogs </span>
			</div>
			<div class="tablecontainer">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID#</th>
							<th>Date#</th>
							<th>Title#</th>
							<th>Message</th>
							<th>By Whom#</th>
						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="b in ctrl.blogs">
							<td>{{b.Id}}</td>
							<td>{{b.blogDate}}</td>
							<td>{{b.blogTitle}}</td>
							<td>{{b.blogMessage}}</td>
							<td>{{b.blogUser}}</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>

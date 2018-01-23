'use strict';

var UserController=function($scope,$http){
	$scope.getUserList=function(){
		$http.get('users/userlist.json').success(function(userList){
			$scope.users=userList;
		});
	}
	
	$scope.addNewUser=function(newUser){
		$http.post('users/addNewUser/'+newUser).success(function(){
			$scope.getUserList();
		});
		$scope.name='';
	}
	
	$scope.removeUser=function(user){
		 $http.delete('users/removeUser/'+user).success(function() {
			 	$scope.getUserList();
	        });
	}
	
	$scope.getUserList();
}
var app = angular.module("springDemo", []);


app.controller("StudentController", function ($scope, $http) {
    $scope.websites = [];
    $http.get('/student/getAll').then(function (response) {
        $scope.websites = response.data;
        console.log(response);
    });
});
app.controller("GroupController", function ($scope, $http) {
    $scope.websites = [];
    $http.get('/group/getAll').then(function (response) {
        $scope.websites = response.data;
        console.log(response);
    });

});
app.controller("FacultyController", function ($scope, $http) {
    $scope.websites = [];
    $http.get('/faculty/getAll').then(function (response) {
        $scope.websites = response.data;
        console.log(response);
    });
});
app.controller("UniversityController", function ($scope, $http) {
    $scope.websites = [];
    $http.get('/univer/getAll').then(function (response) {
        $scope.websites = response.data;
        console.log(response);
    });

});
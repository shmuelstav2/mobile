var app = angular.module('app', []);
app.controller('Ctrl', function ($scope, $http, $window) {

    $scope.data = {}

    $scope.login = function () {
        $http.post("/api/login", $scope.data)
            .then(handleLogin,handleLogin);
    };

    function handleLogin(response) {
        if(response.status==200){
            $window.location.href = '/database.html';
        }else {
            $scope.error = "Invalid username or password"
        }
    }


});
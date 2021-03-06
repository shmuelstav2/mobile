var app = angular.module('app', []);
app.controller('Ctrl', function ($scope, $filter, $http, $window) {

    function sikumtmuta() {
        $http.get("/api/sikumtmuta/all")
            .then(function (response) {
                $scope.sikumtmuta = response.data;
                $scope.sikumtmuta = $filter('orderBy')($scope.sikumtmuta, 'id', false)
            });
    }

    function sivukim() {
        $http.get("/api/sivukim/all")
            .then(function (response) {
                $scope.sivukim = response.data;
                $scope.sivukim = $filter('orderBy')($scope.sivukim, 'id', false)
            });
    }

    function notrulesivuk() {
        $http.get("/api/notrulesivuk/all")
            .then(function (response) {
                $scope.notrulesivuk = response.data;
                $scope.notrulesivuk = $filter('orderBy')($scope.notrulesivuk, 'id', false)
            });
    }

    if(window.localStorage.getItem('login')=='1'){
        sikumtmuta();
        sivukim();
        notrulesivuk();
    }else
        window.location.href = '/';

});
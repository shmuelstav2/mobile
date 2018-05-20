var app = angular.module('app', []);
    app.controller('Ctrl', function($scope, $http) {

        function sikumtmuta(){
            $http.get("http://localhost:8010/api/sikumtmuta/all")
                .then(function (response) {$scope.sikumtmuta = response.data;});
        }

        function sivukim(){
            $http.get("http://localhost:8010/api/sivukim/all")
                .then(function (response) {$scope.sivukim = response.data;});
        }

        function notrulesivuk(){
            $http.get("http://localhost:8010/api/notrulesivuk/all")
                .then(function (response) {$scope.notrulesivuk = response.data;});
        }

        sikumtmuta();
        sivukim();
        notrulesivuk();

    });
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

angular.module('myApp', []).controller('myCtrl', function ($scope) {

    $scope.sumbit = function () {
        console.log($scope);
       if(angular.isUndefined($scope.data.username)){
            console.log("sssssssssssssss");
       }
    }

});



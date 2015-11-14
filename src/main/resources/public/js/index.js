reservationApp = angular.module('reservationApp.gui', [ 'ui.bootstrap' ]);

reservationApp.controller('HomeController', function($scope) {

});

reservationApp.controller('MainController', function($scope, $http, $q) {
	$scope.slots = [];
	for(var x = 0; x <= 11; x++){
	    $scope.slots.push(new Object());
	    console.log("Add new object");
	}
	
	$scope.reservations;

	$http({
		method : 'GET',
		url : '/reservations'
	}).then(function successCallback(response) {

		$scope.reservations = response.data;
		
		$scope.reservations.forEach(function(reservation){
			reservation.itinerary.forEach(function(transit){
				transit.startDate = new Date(transit.start);
				transit.endDate = new Date(transit.end);
				
				var diffMs = (transit.startDate - transit.endDate);
				var diffMins = Math.round(((diffMs % 86400000) % 3600000) / 60000);
				var timeSlots = diffMins / 10;
				
				transit.timeSlots = timeSlots;
				
				if(transit.name == "JetBlue") {
					transit.style = "background-color : lightblue; color: white";
				} else if (transit.name == "United") {
					transit.style = "background-color : blue; color: white";
				} else if (transit.isTransfer == true) {
					transit.style = "background-color : yellow; color: white";
				}
				
				
			});
		});

	}, function errorCallback(response) {
		// called asynchronously if an error occurs
		// or server returns response with an error status.
	});
	
	

});
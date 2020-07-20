var emp = {
	empId : "100",
	name : "Shantanu",
	loc : "Hyderabad"
}

function printEmpDetails() {
	// document.write(emp.name + " " + emp.loc + " " + emp.empId);
	document.getElementById("container").innerHTML = emp.name + " " + emp.loc
			+ " " + emp.empId;
}

var cars = [ "Audi", "BMW", "Volvo", "Ford", "Maruti", "Mahindra" ];
var cars1 = new Array("Audi", "BMW", "Volvo", "Ford", "Maruti", "Mahindra");

function displayCarsArray() {

	var rows = "<table border='a'>";
	for (i = 0; i < cars.length; i++) {
		rows = rows + "<tr><td>" + cars[i] + "</td></tr>";

	}

	document.getElementById("container").innerHTML = rows + "</table>"
}


function dateDetails(){
	
	var date=new Date();
	var dateString = date.getDay()+" "+date.getHours()+" "+date.getMinutes();
	document.getElementById("dates").innerHTML=dateString;
}
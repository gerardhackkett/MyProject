validateForm=()=>{
    let firstName, lastName, vehicleRegistrationNumber, vehicleBodyStyle, vehicleValue, ownerOfVehicle, carsInHousehold, registeredDate, standardSpecification, accident
    //userName = document.getElementById("userName").value

    firstName=document.getElementById("firstName").value
    lastName=document.getElementById("lastName").value
    vehicleRegistrationNumber = document.getElementById("vehicleRegistrationNumber").value
    vehicleBodyStyle = document.getElementById("vehicleBodyStyle").value
    ownerOfVehicle = document.getElementById("ownerOfVehicle").value
    carsInHousehold = document.getElementById("carsInHousehold").value
    registeredDate = document.getElementById("registeredDate").value
    vehicleValue = document.getElementById("vehicleValue").value
    standardSpecification = document.getElementById("standardSpecification").value
    accident = document.getElementById("accident").value

    if(firstName==""){
        alert("Please enter your first name")
        return false
    }

    if(lastName==""){
        alert("Please enter your last name")
        return false
    }

    if(vehicleRegistrationNumber == ""){
        alert("User name must be provided")
        return false
    }
    if(vehicleBodyStyle == ""){
        alert("Please select a body style")
        return false
    }
    if(userName.length < 3){
        alert("User name must be more than 2 characters")
        return false
    }
    if(isNaN(serviceLength)|| serviceLength < 1){
        alert("Invalid service length")
        return false
    }
}


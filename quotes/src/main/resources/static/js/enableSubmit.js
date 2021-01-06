(function() {
    $('form > input').keyup(function() {

        var emptyfirstname= true;
        // var emptyReg = true;
        // var emptyBodyStyle = true;
        // var emptyMarketValue = true;
        // var emptyOwner = true;
        // var emptyVehicles = true;
        // var emptyDate = true;


        if($(firstName).val() == ''){
            emptyfirstname=true;
        }
        else{
            emptyfirstname=false;
        }

    //     if ( $(vehicleRegistrationNumber).val() == ''||$(vehicleRegistrationNumber).val() == null)  &&{
    //         emptyReg = true;
    //     }
    // else{
    //         emptyReg = false;
    //     }
    //
    //     if ( $(vehicleBodyStyle).val() == ''||$(vehicleBodyStyle).val() == null)  &&{
    //         emptyBodyStyle = true;
    //     }
    // else{
    //         emptyBodyStyle = false;
    //     }
    //
    //     if ( $(ownerOfVehicle).val() == ''||$(ownerOfVehicle).val() == null)  &&{
    //         emptyMarketValue = true;
    //     }
    // else{
    //         emptyMarketValue = false;
    //     }
    //
    //     if ( $(vehicleValue).val() == ''||$(vehicleValue).val() == null)  &&{
    //         emptyMarketValue = true;
    //     }
    // else{
    //         emptyMarketValue = false;
    //     }
    //
    //     if ( $(ownerOfVehicle).val() == ''||$(ownerOfVehicle).val() == null)  &&{
    //         emptyVehicles = true;
    //     }
    // else{
    //         emptyVehicles = false;
    //     }
    //
    //
    //     if ( $(registeredDate).val() == ''||$(registeredDate).val() == null)  &&{
    //         emptyDate = true;
    //     }
    // else{
    //         emptyDate = false;
    //     }


        //if any are empty then disabled button
        if (emptyfirstname) {

            $('#GetQuote').attr('disabled', 'disabled');
        } else {
            $('#GetQuote').removeAttr('disabled');

        }
    });
})()


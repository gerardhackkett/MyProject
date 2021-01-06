(function($) {



    //alert(document.getElementById("vehicleRegistrationNumber").value)



    var marginSlider = document.getElementById('slider-margin');

    if (marginSlider != undefined) {

        noUiSlider.create(marginSlider, {

            start: [1000],

            step: 500,

            connect: [true, false],

            tooltips: [true],

            range: {

                'min': 1000,

                'max': 3000

            },

            format: wNumb({

                decimals: 0,

                thousand: ',',

                //prefix: '$ ',

                postfix:'cc'

            })

        });

    }

    $('#reset').on('click', function(){

        $('#register-form').reset();

    });





    $('#readCCValueButton').on('click', function(){

        alert(marginSlider.noUiSlider.get());

    });



    $('#submitButton').on('click', function(){

        form.submit();

    });





    $('#quote-form').validate({

        rules : {

            first_name : {

                required: true,

            },

            last_name : {

                required: true,

            },

            company : {

                required: true

            },

            email : {

                required: true,

                email : true

            },

            phone_number : {

                required: true,

            }

        },

        onfocusout: function(element) {

            $(element).valid();

        },

    });



    jQuery.extend(jQuery.validator.messages, {

        required: "",

        remote: "",

        email: "",

        url: "",

        date: "",

        dateISO: "",

        number: "",

        digits: "",

        creditcard: "",

        equalTo: ""

    });

})(jQuery);
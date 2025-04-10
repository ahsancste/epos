/*(function( $ ){
    $.fn.displayDataTable = function(columns) {
        //for datatable
        let table = $(this).DataTable({
            ajax: $(this).data("url"),
            serverSide: true,
            columns: columns
        });
        return table;

    };
})( jQuery );*/

$(function () {
    $(".display-vals").displayVals();
});


$(window).bind("pageshow", function() {
    $('form.saveForm').trigger("reset"); //Line1
    $('form.saveForm select').trigger("change"); //Line2
});
//initialize swal
const Toast = Swal.mixin({
    toast: true,
    position: 'center',
    showConfirmButton: false,
    timer: 3000
});
toastr.options = {
    "closeButton": true,
    "positionClass": "toast-top-center",
    "newestOnTop": true,
    "progressBar": true,
    "timeOut": "5000"
}

$(function () {



    $(".datatable").DataTable({
        "responsive": true,
        "autoWidth": false,
    });

/*    Swal.fire({
        position: 'top',
        icon: 'success',
        title: 'Your work has been saved',
        showConfirmButton: false,
        timer: 1500
    })*/


    //Initialize Select2 Elements
/*    $('.select2').prepend('<option selected=""></option>').select2({
        placeholder: "--Select--",
        allowClear: true
    });*/
 /*$('.select2').prepend('<option></option>').select2({
        placeholder: "--Select--",
        allowClear: true
    });
*/
    $(".select2").select2({
        placeholder: "--Select--",
        allowClear: true
    });
    $('.select2-multiple').select2();

    //Initialize Select2 Elements
    $('.select2bs4').select2({
        theme: 'bootstrap4'
    })


//Datemask dd/mm/yyyy
    $('.date-dd-mm-yyyy').inputmask('dd/mm/yyyy', {'placeholder': 'dd/mm/yyyy',
        'yearrange': { minyear: 1900, maxyear: 2015, }})


    $('.bd-mobile').inputmask('Regex', {
        regex: "^[0-9]{2}:[0-5][0-9]:[0-5][0-9]$"
    });

    $(".bd-mobile").inputmask({
        mask: "regex",
        definitions: {'5': {validator: "^[0-9]{2}:[0-5][0-9]:[0-5][0-9]$"}}
    });


    //for active menu
    let pathname = window.location.pathname;
    $("#sideMenu li a").each(function (i) {
        $(this).removeClass("active");
        $(this).parents(".has-treeview").removeClass("menu-open");

        let linkPath = $(this).attr('href');
        if (linkPath == pathname) {
            $(this).addClass("active");
            $(this).parents(".has-treeview").children("a").first().addClass("active");
            $(this).parents(".has-treeview").addClass("menu-open");
            return false;
        }
    });

//for news ticker
    $('.my-news-ticker').AcmeTicker({
        type:'typewriter',/*horizontal/horizontal/Marquee/type*/
        direction: 'right',/*up/down/left/right*/
        speed:50,/*true/false/number*/ /*For vertical/horizontal 600*//*For marquee 0.05*//*For typewriter 50*/
        controls: {
            prev: $('.acme-news-ticker-prev'),/*Can be used for horizontal/horizontal/typewriter*//*not work for marquee*/
            toggle: $('.acme-news-ticker-pause'),/*Can be used for horizontal/horizontal/typewriter*//*not work for marquee*/
            next: $('.acme-news-ticker-next')/*Can be used for horizontal/horizontal/marquee/typewriter*/
        }
    });



});



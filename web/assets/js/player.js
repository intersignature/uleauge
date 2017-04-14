function aaa(){

    $(".filter-button").click(function(){
    var value = $(this).attr('data-filter');
    $(this).toggleClass("active");
        //alert(value);
        
     //$(this).addClass('active');
            
//            $('.filter[filter-item="'+value+'"]').removeClass('hidden');
//            $(".filter").not('.filter[filter-item="'+value+'"]').addClass('hidden');
    $(".filter").not('.'+value).hide('3000');
    $('.filter').filter('.'+value).show('3000');

    });

};
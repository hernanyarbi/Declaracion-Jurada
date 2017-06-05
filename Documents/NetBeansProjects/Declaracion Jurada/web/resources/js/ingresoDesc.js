$(document).ready(function () {
    $ = jQuery;
    console.log("fuera");
    $("#frmAgente\\:tab\\:btn_grabar").on("click", function () {
        console.log("dentro");
        
        $("#frmAgente\\:tab\\:btn_modif").attr("disabled", false);
        $dis = $(".dis");
        $dis.attr("disabled", true);
    });
});


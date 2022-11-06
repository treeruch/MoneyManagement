$(document).ready(function(){
	$('#level1').val('1');
});

function listPage(){
	var menu = $('#level1').val();
	
	if(menu == '2'){
		$('#listPage').css('display','');
	} else {
		$('#listPage').css('display','none');
	}
}
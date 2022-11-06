$(document).ready(function(){
	$('#lavelList').val('1');
});

function listPage(){
	var menu = $('#lavelList').val();
	
	if(menu == '2'){
		$('#listPage').css('display','');
	} else {
		$('#listPage').css('display','none');
	}
}
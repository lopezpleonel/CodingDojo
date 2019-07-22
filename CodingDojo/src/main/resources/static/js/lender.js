$(document).ready( function () {
	 var table = $('#lenderTable').DataTable({
			"sAjaxSource": "/lender/all",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "firstname"},
		          { "mData": "email" },
				  { "mData": "amount" }
			]
	 })
});
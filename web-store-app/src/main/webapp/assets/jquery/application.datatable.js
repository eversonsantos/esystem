var appDataTableOptions = 
	{
		"bServerSide": false,
	    "bProcessing": false,
	    "bScrollCollapse": true,
		"oLanguage": 
		{
			"sLengthMenu":	"Mostrar _MENU_ registros por página",
			"sZeroRecords":	"Sem registros.",
			"sInfo": 		"",
			"sInfoEmpty": 	"",
			"sInfoFiltered":"(filtered from _MAX_ total records)",
			"oPaginate": {
				"sFirst":	"",
				"sNext":	"",
				"sPrevious":"",
				"sLast":""
			}
		},
		"sDom":
			"t" + 
			"<'row-fluid actions-toolbar'" + 
				"<'actions-toolbar-inner'" + 
					"<'span4'<'control-group'l>>" + 
					"<'span4'i>" + 
					"<'span4'<'pagination pagination-right'p>>" +
				">" + 
			">"
	};
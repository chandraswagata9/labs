/**
 * Code written here can be referenced by html file inside script tag.
 */
function runList() {
  // Type your code here.
     //Enter your return statement here
	var ddl = document.getElementById("list");
    var option = document.createElement("OPTION");
    option.innerHTML = document.getElementById("txtbox").value;
    ddl.options.add(option);
    
    
    
}


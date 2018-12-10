alert("test");

var database = [
{user : "Martin",
pass : "123"
}
];

var user = prompt("zadej jmeno");
var pass = prompt("zadej heslo");

signIn(user, pass);

function signIn(user, pass){
	for (var i = 0; i < database.length; i++) {
		if (user === database[i].user && pass === database[i].pass) {
	console.log("bravo");
}else{
	alert("sorry");
}
	}

	}
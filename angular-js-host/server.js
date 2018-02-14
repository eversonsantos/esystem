var express = require('express');
var app = express();
// var path = require('path');

// app.use(express.static(__dirname+'/public'));
app.use(express.static(__dirname+'/'));


// app.get('/', function (req, res) {
//     res.redirect('/');
// });

app.listen(3000, 'localhost');
console.log("Server is Listening on port 3000");
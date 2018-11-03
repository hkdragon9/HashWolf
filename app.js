
const port = process.env.PORT || 8888; //sets local server port to 8888
const express = require('express'); // Express web server framework
const redirect_uri = 'http://localhost:8888'; // Your redirect uri in case you are using apis
var app = express();
app.use(express.static(__dirname)) //this directs the app to the directory with the html file, __dirname is the directory of the app.js file, in this case my index.html is in a folder called public that is in the same directory, if your index.html is in the same directory as app.js remove the “+ ‘/public/’”
console.log('Listening on 8888'); //prints to the console
app.listen(port, function() {}); //starts the server, alternatively you can use app.listen(port)

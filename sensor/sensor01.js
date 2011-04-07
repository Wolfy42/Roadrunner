/**
 * sensor01.js
 * 
 * @author matthias schmid
 * @date 07.04.2011
 * 
 * Returns random integers from 15 to 20 as a String
 */

var argv = require('optimist').argv;
var http = require('http');

var temp = function() {
	var rand = 15 + Math.floor(Math.random()*5);
    return rand.toString();
}

http.createServer(function(req, res) {
    console.log(req.method + " " + req.url + ' HTTP/' + req.httpVersion);
    res.writeHead('200', {'Content-Type': 'text/plain'});
    res.end(temp());
}).listen(argv.port, argv.ip);
console.log('Server started at http://' + argv.ip + ':' + argv.port + '/');

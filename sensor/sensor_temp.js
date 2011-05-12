/**
 * sensor_temp.js
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


if (argv.port == null || argv.port == 'undefined' || argv.ip == null 
		|| argv.ip == 'undefined') {
	
	console.log("\nTEMPERATUR SENSOR ERROR:\n" +
			"Start Sensor with: node sensor_time.js " +
			"--ip <ip address> --port <port number>\n");
	return;
}

http.createServer(function(req, res) {
    console.log(req.method + " " + req.url + ' HTTP/' + req.httpVersion + ' at ' 
    		+ new Date());
    
    res.writeHead('200', {'Content-Type': 'text/plain'});
    res.end(temp());
}).listen(argv.port, argv.ip);
console.log('Server started at http://' + argv.ip + ':' + argv.port + '/');

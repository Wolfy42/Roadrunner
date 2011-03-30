var argv = require('optimist').argv;
var http = require('http');

var temp = function() {
    return '17';
}

http.createServer(function(req, res) {
    console.log(req.method + " " + req.url + ' HTTP/' + req.httpVersion);
    res.writeHead('200', {'Content-Type': 'text/plain'});
    res.end(temp());
}).listen(argv.port, argv.ip);
console.log('Server started at http://' + argv.ip + ':' + argv.port + '/');

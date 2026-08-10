const http = require('http');
const fs = require('fs');
const path = require('path');


const server = http.createServer((req, res)=>{
    if(req.method === 'GET' && req.url === '/'){
        fs.readFile(path.join(__dirname,'index.html'),(err, data)=>{
            if(err) throw err;
            res.writeHead(200, {'Content-Type': 'text/html'});
            res.end(data);
        });
    }
    else if(req.method === 'GET' && req.url === '/home'){
        fs.readFile(path.join(__dirname,'home.html'),(err, data)=>{
            if(err) throw err;
            res.writeHead(200, {'Content-Type': 'text/html'});
            res.end(data);
        });
    }
})


server.listen(8080, ()=>{
    console.log('Server is running on http://localhost:8080');
});
const http = require('http');
const fs = require('fs');
const path = require('path');
const formidable = require('formidable');


const server = http.createServer((req, res)=>{
    if(req.method === 'POST' && req.url === '/upload') {
            const form = new formidable.IncomingForm();
            form.parse(req, (err, fields, files) => {
            if (err) {
                res.writeHead(500, { 'Content-Type': 'text/plain' });
                res.end('Internal Server Error');
                return;
            }
            res.writeHead(200, { 'Content-Type': 'text/plain' });
            res.end('File uploaded successfully!');

    }); }
    else if(req.method === 'GET' && req.url === '/'){
        const filePath = path.join(__dirname, 'home.html');
        fs.readFile(filePath, (err, data) => {
            if (err) {
                res.writeHead(500, { 'Content-Type': 'text/plain' });
                res.end('Internal Server Error');
            } else {
                res.writeHead(200, { 'Content-Type': 'text/html' });
                res.end(data); 
            }
        })
    }
})


server.listen(8080, ()=>{
    console.log('Server is running on http://localhost:8080');
});
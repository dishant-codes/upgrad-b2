const http = require("node:http");  // built In module for HTTP

const server = http.createServer((req, res)=>{

    res.statusCode = 200;

    res.setHeader("Content-Type","text/json");

    const data = [
        {
            "name":"Dishant",
            "age": 40   
        },
        {
            "name":"XYZ",
            "age": 100
        }
    ]
    res.end(JSON.stringify(data))

})

server.listen(3000,"localhost",()=>{
    console.log("Server is Running on PORT 3000...");
})
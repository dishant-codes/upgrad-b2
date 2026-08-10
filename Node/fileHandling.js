const fs = require('fs');

let data;

fs.readFile("data.txt", (err, data)=>{
    if(err) throw err;
    data = data.toString();
    let finalText = data + ", Happy Coding!";
    writeToFile(finalText);
})

function writeToFile(finalText) {
    fs.writeFile("data.txt", finalText, (err)=>{
        if(err) throw err;
    });
}
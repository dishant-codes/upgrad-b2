import express from "express";
import bodyParser from "body-parser"
import mongoose from "mongoose";

const app = express();


mongoose.connect("mongodb://localhost:27017/batch2").then(()=>{
     console.log("MongoDB Connected");
})

const learnerSchema = new mongoose.Schema({
    id: Number,
    name: String,
    email:String,
    course:String
});

const Learner = mongoose.model("learners", learnerSchema);



app.use(bodyParser.json());
app.use(express.json());


app.get("/learner", async (req, res)=>{
    const learners = await Learner.find();
    res.status(201).json(learners)
})


app.post("/learner",  async (req, res)=>{

    const {id, name, email, course} = req.body;

    const newLearner = new Learner({
        id,
        name,
        email,
        course
    })

    const result = await newLearner.save();

    res.status(201).json(result);
})


app.put("/learner", (req, res)=>{
    res.send("PUT Request")
})

app.delete("/learner", (req, res)=>{
    res.send("DELETE Request")
})



app.listen(8080,"localhost",()=>{
    console.log("Server is Running at http://localhost:8080");
});
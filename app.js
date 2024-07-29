const express = require("express");

const { request } = require("https");


let app = express();

let port = 5050;
const path = require("path");
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"views"));
app.use(express.urlencoded ({extended : true}));
app.set(express.static(path.join(__dirname,"public")));


let posts= [
    {
        id :"1a",
username:"sai",
content: "love coding",
    }, 
    {
        id :"2b",
        username:"prem",
        content: "love driving",
            },
            {
                id :"3c",
                username:"mom",
                content: "love cooking",
                    },
                    {
                        id :"4d",
                        username:"Anu",
                        content: "love Travelling",
                            },

];
app.get("/posts",(req,res)=>
{
    res.render("index.ejs",{posts});
   
    
    console.log("post is woring ");
});
app.get("/",(req,res)=>{
    res.send("server is working"); 
});

app.get("/posts/new",(req,res)=>
{
res.render ("new.ejs");
});
app.get("/posts/:id",(req,res)=>
    {
let {id}= req.params;
let post =posts.find((p)=>id ==p.id);
res.render("shows.ejs",{post});

    });
app.post("/posts",(req,res)=>
    {
 let { username , content } = req.body;
   posts.push({username , content});
   res.redirect("/posts");
   res.send("post is working");

    });

app.listen(port,()=>{
    console.log(`port is listning at${port}`);
});
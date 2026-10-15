from fastapi import FastAPI
from pydantic import BaseModel
from typing import List

app=FastAPI()

class Tea(BaseModel):
    id:int
    name:str
    origin:str

teas:List[Tea]=[]

@app.get("/")
def read_root():
    return{"message":"Here is your Tea!"}

@app.get("/teas")
def get_teas():
    return teas

@app.post("/")
def add_tea(tea:Tea):
    teas.append(tea)
    return tea

@app.put("/teas/{tea_id}")
def 


